/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.gwlpr.mapshard.events;

import com.gamerevision.gwlpr.mapshard.entitysystem.Entity;
import com.gamerevision.gwlpr.mapshard.models.GWVector;
import com.gamerevision.gwlpr.mapshard.models.enums.MovementType;
import com.realityshard.shardlet.Event;


/**
 * Triggered when an entity starts moving around,
 * or changes direction while moving.
 *
 * @author _rusty
 */
public class StartMovingEvent implements Event
{
    private final Entity thisEntity;
    private final GWVector direction;
    private final MovementType type;


    /**
     * Constructor.
     *
     * @param       thisEntity
     * @param       direction
     * @param       type
     */
    public StartMovingEvent(Entity thisEntity, GWVector direction, MovementType type)
    {
        this.thisEntity = thisEntity;
        this.direction = direction;
        this.type = type;
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


    /**
     * Getter.
     *
     * @return
     */
    public GWVector getDirection()
    {
        return direction;
    }


    /**
     * Getter.
     *
     * @return
     */
    public MovementType getType()
    {
        return type;
    }
}
