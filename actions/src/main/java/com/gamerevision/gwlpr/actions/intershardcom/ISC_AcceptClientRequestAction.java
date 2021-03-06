/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.gwlpr.actions.intershardcom;

import com.realityshard.shardlet.EventAggregator;
import com.realityshard.shardlet.utils.GenericTriggerableAction;

/**
 * Request from the LoginShard to a MapShard to accept a session.
 *
 * @author miracle444, _rusty
 */
public final class ISC_AcceptClientRequestAction extends GenericTriggerableAction
{

    private int key1;
    private int key2;
    private final int accountId;
    private int characterId;
    
    
    /**
     * Constructor.
     * 
     * @param       key1                    The first security key (the client will
     *                                      use that to connect with the map shard)
     * @param       key2                    The second security key
     * @param       accountId               The account ID of the client
     * @param       characterId             The character ID of the client
     */
    public ISC_AcceptClientRequestAction(int key1, int key2, int accountId, int characterId)
    {
        init(null);
        this.key1 = key1;
        this.key2 = key2;
        this.accountId = accountId;
        this.characterId = characterId;
    }

    
    /**
     * Getter.
     * 
     * @return 
     */
    public int getKey1() 
    {
        return key1;
    }
    
    
    /**
     * Getter.
     * 
     * @return 
     */
    public int getKey2() 
    {
        return key2;
    }

    
    /**
     * Getter.
     * 
     * @return 
     */
    public int getAccountId() 
    {
        return accountId;
    }
      
    
    /**
     * Getter.
     * 
     * @return 
     */
    public int getCharacterId() 
    {
        return characterId;
    }

    
    /**
     * This method is used by the context of a game app, when this action is 
     * transmitted to another game app.
     * The purpose is to let the action trigger the event by itself instead of
     * having to know the exact type.
     */
    @Override
    public void triggerEvent(EventAggregator aggregator)
    {
        aggregator.triggerEvent(this);
    }
}