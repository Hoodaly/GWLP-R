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
public final class P170_UnknownAction extends GenericTriggerableAction
{

    private short unknown1;
    private byte unknown2;
    private short unknown3;
    private byte unknown4;
    private byte unknown5;


    public short getHeader()
    {
        return 170;
    }


    public short getUnknown1()
    {
        return unknown1;
    }


    public byte getUnknown2()
    {
        return unknown2;
    }


    public short getUnknown3()
    {
        return unknown3;
    }


    public byte getUnknown4()
    {
        return unknown4;
    }


    public byte getUnknown5()
    {
        return unknown5;
    }


    @Override
    public boolean deserialize()
    {
        ByteBuffer buffer = getBuffer();
        int bufferPosition = buffer.position();

        try
        {
            unknown1 = buffer.getShort();
            unknown2 = buffer.get();
            unknown3 = buffer.getShort();
            unknown4 = buffer.get();
            unknown5 = buffer.get();
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