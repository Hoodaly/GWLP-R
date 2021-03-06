/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.gwlpr.mapshard.events;

import com.gamerevision.gwlpr.mapshard.entitysystem.Entity;
import com.realityshard.shardlet.Event;


/**
 * Triggered when an entity lost sight of another one.
 * 
 * @author _rusty
 */
public class LostSightEvent implements Event
{
    
    private final Entity thisEntity;
    private final Entity otherEntity;
    
    
    /**
     * Constructor.
     * 
     * @param       thisEntity              This entity has lost sight of
     * @param       otherEntity             The other entity
     */
    public LostSightEvent(Entity thisEntity, Entity otherEntity)
    {
        this.thisEntity = thisEntity;
        this.otherEntity = otherEntity;   
    }

    
    /**
     * Getter.
     * 
     * @return 
     */
    public Entity getOtherEntity() 
    {
        return otherEntity;
    }

    
    /**
     * Getter.
     * 
     * @return 
     */
    public Entity getThisEntity() 
    {
        return thisEntity;
    }
}
