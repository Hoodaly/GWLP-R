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
public final class P070_UnknownAction extends GenericTriggerableAction
{

    private byte unknown1;
    private int unknown2;
    private int[] unknown3;
    private byte[] unknown4;
    private int unknown5;
    private int[] unknown6;
    private byte[] unknown7;


    public short getHeader()
    {
        return 70;
    }


    public byte getUnknown1()
    {
        return unknown1;
    }


    public int getUnknown2()
    {
        return unknown2;
    }


    public int[] getUnknown3()
    {
        return unknown3;
    }


    public byte[] getUnknown4()
    {
        return unknown4;
    }


    public int getUnknown5()
    {
        return unknown5;
    }


    public int[] getUnknown6()
    {
        return unknown6;
    }


    public byte[] getUnknown7()
    {
        return unknown7;
    }


    @Override
    public boolean deserialize()
    {
        ByteBuffer buffer = getBuffer();
        int bufferPosition = buffer.position();

        try
        {
            unknown1 = buffer.get();
            unknown2 = buffer.getInt();
            short prefix_unknown3 = buffer.getShort();
            unknown3 = new int[prefix_unknown3];
            
            for (int i = 0; i < prefix_unknown3; i++)
            {
                unknown3[i] = buffer.getInt();
            }
            short prefix_unknown4 = buffer.getShort();
            unknown4 = new byte[prefix_unknown4];
            
            for (int i = 0; i < prefix_unknown4; i++)
            {
                unknown4[i] = buffer.get();
            }
            unknown5 = buffer.getInt();
            short prefix_unknown6 = buffer.getShort();
            unknown6 = new int[prefix_unknown6];
            
            for (int i = 0; i < prefix_unknown6; i++)
            {
                unknown6[i] = buffer.getInt();
            }
            short prefix_unknown7 = buffer.getShort();
            unknown7 = new byte[prefix_unknown7];
            
            for (int i = 0; i < prefix_unknown7; i++)
            {
                unknown7[i] = buffer.get();
            }
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