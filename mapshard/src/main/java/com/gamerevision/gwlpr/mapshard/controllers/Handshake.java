/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.gwlpr.mapshard.controllers;

import com.gamerevision.gwlpr.actions.gameserver.ctos.P16896_ClientSeedAction;
import com.gamerevision.gwlpr.actions.gameserver.stoc.P371_UnknownAction;
import com.gamerevision.gwlpr.actions.gameserver.stoc.P395_InstanceLoadDistrictInfoAction;
import com.gamerevision.gwlpr.mapshard.SessionAttachment;
import com.gamerevision.gwlpr.mapshard.views.CharacterCreateHeadView;
import com.gamerevision.gwlpr.mapshard.views.InstanceLoadHeadView;
import com.gamerevision.gwlpr.mapshard.views.ServerSeedView;
import com.realityshard.shardlet.EventHandler;
import com.realityshard.shardlet.GenericShardlet;
import com.realityshard.shardlet.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * This shardlet handles the handshake process for GW clients.
 * It establishes an encrypted session.
 * 
 * @author _rusty
 */
public class Handshake extends GenericShardlet
{
    private static Logger LOGGER = LoggerFactory.getLogger(Handshake.class);
    
    
    @Override
    protected void init() 
    {
        LOGGER.debug("handshake shardlet initialized!");
    }
    
    
    @EventHandler
    public void clientSeedHandler(P16896_ClientSeedAction action)
    {
        LOGGER.debug("got the client seed packet");
        Session session = action.getSession();
        
        
        LOGGER.debug("sending server seed");
        sendAction(ServerSeedView.create(session));
        
        
        LOGGER.debug("sending instance load head");
        sendAction(InstanceLoadHeadView.create(session));
        
        int mapId = Integer.parseInt(getShardletContext().getInitParameter("MapId"));
        
        if (mapId == 0)
        {
            LOGGER.debug("sending start character creation");
            sendAction(CharacterCreateHeadView.create(session));
        }
        else
        {
            LOGGER.debug("sending instance load stuff");
            SessionAttachment attachment = (SessionAttachment) session.getAttachment();
            
            P371_UnknownAction instanceLoadCharName = new P371_UnknownAction();
            instanceLoadCharName.init(session);
            LOGGER.debug("sending instance load stuff1");
            instanceLoadCharName.setUnknown1(attachment.getCharacterName().toCharArray());
            LOGGER.debug("sending instance load stuff2");
            sendAction(instanceLoadCharName);
            
            
            P395_InstanceLoadDistrictInfoAction instanceLoadDistrictInfo = new P395_InstanceLoadDistrictInfoAction();
            instanceLoadDistrictInfo.init(session);
            instanceLoadDistrictInfo.setCharAgent(1);
            instanceLoadDistrictInfo.setDistrictAndRegion(0);
            instanceLoadDistrictInfo.setLanguage((byte) 0);
            instanceLoadDistrictInfo.setMapID((short) mapId);
            instanceLoadDistrictInfo.setisExplorable((byte) 1);
            instanceLoadDistrictInfo.setisObserver((byte) 0);
            sendAction(instanceLoadDistrictInfo);
        }
    }
}
