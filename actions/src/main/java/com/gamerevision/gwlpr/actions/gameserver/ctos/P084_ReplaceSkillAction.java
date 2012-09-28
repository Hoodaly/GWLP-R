/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-09-28
 */

package com.gamerevision.gwlpr.actions.gameserver.ctos;

import com.realityshard.shardlet.EventAggregator;
import com.realityshard.shardlet.utils.GenericTriggerableAction;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/**
 * This is an automatically generated ShardletAction.
 * It resembles the packet template that has been 
 * parsed from our packet templates xml.
 *
 *
 * @author GWLPR Template Updater
 */
public final class P084_ReplaceSkillAction extends GenericTriggerableAction
{

    private int agentID;
    private int skillSlot;
    private int skillID;
    private int unknown;


    public short getHeader()
    {
        return 84;
    }


    public int getAgentID()
    {
        return agentID;
    }


    /**
     * Slot of the skill you are changing (between 0 and 7) 
     */
    public int getSkillSlot()
    {
        return skillSlot;
    }


    /**
     * ID of the new skill 
     */
    public int getSkillID()
    {
        return skillID;
    }


    /**
     * Always 0 when called from Guild Wars, if sent as a 
     * non-zero value it seems the packet has no effect 
     */
    public int getUnknown()
    {
        return unknown;
    }


    @Override
    public boolean deserialize()
    {
        ByteBuffer buffer = getBuffer();
        int bufferPosition = buffer.position();

        try
        {
            agentID = buffer.getInt();
            skillSlot = buffer.getInt();
            skillID = buffer.getInt();
            unknown = buffer.getInt();
        }
        catch (BufferUnderflowException e)
        {
            buffer.position(bufferPosition);
            return false;
        }

        return true;
    }


    @Override
    public void triggerEvent(EventAggregator aggregator)
    {
        aggregator.triggerEvent(this);
    }
}