/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-09-28
 */

package com.gamerevision.gwlpr.actions.loginserver.ctos;

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
public final class P005_UnknownAction extends GenericTriggerableAction
{

    private int unknown1;
    private int unknown2;
    private byte[] unknown3;
    private byte[] unknown4;
    private char[] unknown5;


    public short getHeader()
    {
        return 5;
    }


    public int getUnknown1()
    {
        return unknown1;
    }


    public int getUnknown2()
    {
        return unknown2;
    }


    public byte[] getUnknown3()
    {
        return unknown3;
    }


    public byte[] getUnknown4()
    {
        return unknown4;
    }


    public char[] getUnknown5()
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
            unknown1 = buffer.getInt();
            unknown2 = buffer.getInt();
            unknown3 = new byte[20];
            
            for (int i = 0; i < 20; i++)
            {
                unknown3[i] = buffer.get();
            }
            unknown4 = new byte[20];
            
            for (int i = 0; i < 20; i++)
            {
                unknown4[i] = buffer.get();
            }
            short prefix_unknown5 = buffer.getShort();
            unknown5 = new char[prefix_unknown5];
            
            for (int i = 0; i < prefix_unknown5; i++)
            {
                unknown5[i] = buffer.getChar();
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