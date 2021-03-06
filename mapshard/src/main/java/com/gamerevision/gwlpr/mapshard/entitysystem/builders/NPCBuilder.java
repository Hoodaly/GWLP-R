/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.gwlpr.mapshard.entitysystem.builders;

import com.gamerevision.gwlpr.mapshard.entitysystem.Entity;
import com.gamerevision.gwlpr.mapshard.entitysystem.EntityManager;
import com.gamerevision.gwlpr.mapshard.entitysystem.components.Components.*;
import com.gamerevision.gwlpr.mapshard.models.GWString;
import com.gamerevision.gwlpr.mapshard.models.GWVector;
import com.gamerevision.gwlpr.mapshard.models.enums.Profession;
import com.gamerevision.gwlpr.mapshard.models.enums.SpawnType;


/**
 * Use this class to create a new non-player-character entity.
 *
 * This extends the player builder functionality
 *
 * @author _rusty
 */
public final class NPCBuilder
{

    private PlayerBuilder playerBuilder;
    private Entity entity;
    

    /**
     * Constructor.
     */
    private NPCBuilder(PlayerBuilder playerBuilder)
    {        
        this.playerBuilder = playerBuilder;
        
        // tricky tricky: ask the player build for its entity right now,
        // so we can use the same reference later on, and we dont need to
        // mind the different build steps
        this.entity = playerBuilder.build();
    }


    /**
     * Start building process.
     */
    public static NPCBuilder createFor(EntityManager manager)
    {
        PlayerBuilder bld = PlayerBuilder.createFor(manager);

        // use an underlying playerbuilder
        return new NPCBuilder(bld);
    }


    /**
     * Step 1.
     */
    public NPCBuilder withAgentData(String playerName, int playerAgentID, int playerLocalID)
    {
        playerBuilder.withAgentData(playerName, playerAgentID, playerLocalID);
        
        return this;
    }


    /**
     * Step 2.
     */
    public NPCBuilder withPhysics(
            GWVector playerPosition,
            GWVector playerDirection,
            float boundsRectWidth,
            float boundsRectHeight,
            float boundsPlayerHeight)
    {
        playerBuilder.withPhysics(playerPosition, playerDirection, boundsRectWidth, boundsRectHeight, boundsPlayerHeight);
                
        return this;
    }


    /**
     * Step 3.
     */
    public NPCBuilder withVisuals(byte[] playerAppearance, float playerViewDistance, boolean isVisible)
    {
        playerBuilder.withVisuals(playerAppearance, playerViewDistance, isVisible);
        
        return this;
    }
    
    
    /**
     * Step 4.
     */
    public NPCBuilder withCharData(Profession primary, Profession secondary, int level, int morale)
    {
        playerBuilder.withCharData(primary, secondary, level, morale);
        
        return this;
    }
    
    
    /**
     * Step 5.
     */
    public NPCBuilder withFactionData()
    {
        FactionData fd = new FactionData();
        fd.spawnType = SpawnType.NPC;
        fd.factionColor = 0x20;
        
        entity.addAll(fd);
        return this;
    }


    /**
     * Step 6.
     */
    public NPCBuilder withNPCData(int fileID, int[] modelHashes, int flags, int scale, String hashedName)
    {
        NPCData npcData = new NPCData();
        npcData.fileID = fileID;
        npcData.modelHashes = modelHashes;
        npcData.flags = flags;
        npcData.scale = scale;
        npcData.hashedName = hashedName;

        // we can simply use our own entity reference, as the constructor made sure that
        // its the same as the one of the underlying player builder.
        entity.addAll(npcData);
        return this;
    }


    /**
     * Last Step.
     */
    public Entity build()
    {
        // nothing else to do here (currently)
        return entity;
    }
}
