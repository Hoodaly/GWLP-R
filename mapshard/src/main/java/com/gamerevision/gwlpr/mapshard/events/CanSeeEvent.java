/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.gwlpr.mapshard.events;

import com.gamerevision.gwlpr.mapshard.entitysystem.Entity;
import com.realityshard.shardlet.Event;

/**
 * Triggered when an entity can see another one
 * 
 * @author _rusty
 */
public class CanSeeEvent implements Event
{
    private final Entity thisEntity;
    private final Entity otherEntity;
    
    
    /**
     * Constructor.
     * 
     * @param       thisEntity              This entity has seen the
     * @param       otherEntity             The other entity (that has been seen)
     */
    public CanSeeEvent(Entity thisEntity, Entity otherEntity)
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
