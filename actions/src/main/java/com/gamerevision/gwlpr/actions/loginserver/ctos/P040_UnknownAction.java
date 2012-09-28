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
public final class P040_UnknownAction extends GenericTriggerableAction
{

    private int unknown1;
    private char[] unknown2;
    private char[] unknown3;
    private char[] unknown4;
    private char[] unknown5;
    private char[] unknown6;
    private char[] unknown7;
    private char[] unknown8;


    public short getHeader()
    {
        return 40;
    }


    public int getUnknown1()
    {
        return unknown1;
    }


    public char[] getUnknown2()
    {
        return unknown2;
    }


    public char[] getUnknown3()
    {
        return unknown3;
    }


    public char[] getUnknown4()
    {
        return unknown4;
    }


    public char[] getUnknown5()
    {
        return unknown5;
    }


    public char[] getUnknown6()
    {
        return unknown6;
    }


    public char[] getUnknown7()
    {
        return unknown7;
    }


    public char[] getUnknown8()
    {
        return unknown8;
    }


    @Override
    public boolean deserialize()
    {
        ByteBuffer buffer = getBuffer();
        int bufferPosition = buffer.position();

        try
        {
            unknown1 = buffer.getInt();
            short prefix_unknown2 = buffer.getShort();
            unknown2 = new char[prefix_unknown2];
            
            for (int i = 0; i < prefix_unknown2; i++)
            {
                unknown2[i] = buffer.getChar();
            }
            short prefix_unknown3 = buffer.getShort();
            unknown3 = new char[prefix_unknown3];
            
            for (int i = 0; i < prefix_unknown3; i++)
            {
                unknown3[i] = buffer.getChar();
            }
            short prefix_unknown4 = buffer.getShort();
            unknown4 = new char[prefix_unknown4];
            
            for (int i = 0; i < prefix_unknown4; i++)
            {
                unknown4[i] = buffer.getChar();
            }
            short prefix_unknown5 = buffer.getShort();
            unknown5 = new char[prefix_unknown5];
            
            for (int i = 0; i < prefix_unknown5; i++)
            {
                unknown5[i] = buffer.getChar();
            }
            short prefix_unknown6 = buffer.getShort();
            unknown6 = new char[prefix_unknown6];
            
            for (int i = 0; i < prefix_unknown6; i++)
            {
                unknown6[i] = buffer.getChar();
            }
            short prefix_unknown7 = buffer.getShort();
            unknown7 = new char[prefix_unknown7];
            
            for (int i = 0; i < prefix_unknown7; i++)
            {
                unknown7[i] = buffer.getChar();
            }
            short prefix_unknown8 = buffer.getShort();
            unknown8 = new char[prefix_unknown8];
            
            for (int i = 0; i < prefix_unknown8; i++)
            {
                unknown8[i] = buffer.getChar();
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