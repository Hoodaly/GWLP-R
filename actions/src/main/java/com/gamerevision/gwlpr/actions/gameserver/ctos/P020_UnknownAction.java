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
 * Auto generated 
 *
 * @author GWLPR Template Updater
 */
public final class P020_UnknownAction extends GenericTriggerableAction
{

    private int unknown1;
    private int unknown2;
    private int unknown3;
    private int unknown4;


    public short getHeader()
    {
        return 20;
    }


    public int getUnknown1()
    {
        return unknown1;
    }


    public int getUnknown2()
    {
        return unknown2;
    }


    public int getUnknown3()
    {
        return unknown3;
    }


    public int getUnknown4()
    {
        return unknown4;
    }


    @Override
    public boolean deserialize()
    {
        ByteBuffer buffer = getBuffer();
        int bufferPosition = buffer.position();

        try
        {
            unknown1 = buffer.getInt();
            unknown2 = buffer.getInt();
            unknown3 = buffer.getInt();
            unknown4 = buffer.getInt();
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