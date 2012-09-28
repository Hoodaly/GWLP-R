/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-09-28
 */

package com.gamerevision.gwlpr.actions.gameserver.stoc;

import com.realityshard.shardlet.utils.GenericAction;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * This is an automatically generated ShardletAction.
 * It resembles the packet template that has been 
 * parsed from our packet templates xml.
 *
 * Auto generated 
 *
 * @author GWLPR Template Updater
 */
public final class P405_UnknownAction extends GenericAction
{

    private int unknown1;
    private short unknown2;
    private byte unknown3;
    private int unknown4;
    private byte unknown5;
    private byte unknown6;
    private int unknown7;
    private float[] unknown8;
    private short unknown9;
    private byte unknown10;
    private byte unknown11;
    private char[] unknown12;


    public short getHeader()
    {
        return 405;
    }


    public void setUnknown1(int newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(short newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(byte newValue)
    {
        unknown3 = newValue;
    }


    public void setUnknown4(int newValue)
    {
        unknown4 = newValue;
    }


    public void setUnknown5(byte newValue)
    {
        unknown5 = newValue;
    }


    public void setUnknown6(byte newValue)
    {
        unknown6 = newValue;
    }


    public void setUnknown7(int newValue)
    {
        unknown7 = newValue;
    }


    public void setUnknown8(float[] newValue)
    {
        unknown8 = newValue;
    }


    public void setUnknown9(short newValue)
    {
        unknown9 = newValue;
    }


    public void setUnknown10(byte newValue)
    {
        unknown10 = newValue;
    }


    public void setUnknown11(byte newValue)
    {
        unknown11 = newValue;
    }


    public void setUnknown12(char[] newValue)
    {
        unknown12 = newValue;
    }


    private int getSize()
    {
        int size = 33;

        if (unknown8 == null)
        {
            return 0;
        }
        
        if (unknown8.length != 2)
        {
            return 0;
        }
        if (unknown12 != null)
        {
            size += 2 * unknown12.length;
        }

        return size;
    }


    @Override
    public boolean serialize()
    {
        int size = getSize();

        if (size == 0)
        {
            return false;
        }

        ByteBuffer buffer = ByteBuffer.allocate(size).order(ByteOrder.LITTLE_ENDIAN);

        try
        {
            buffer.putShort(getHeader());

            buffer.putInt(unknown1);
            buffer.putShort(unknown2);
            buffer.put(unknown3);
            buffer.putInt(unknown4);
            buffer.put(unknown5);
            buffer.put(unknown6);
            buffer.putInt(unknown7);
            buffer.putFloat(unknown8[0]);
            buffer.putFloat(unknown8[1]);
            buffer.putShort(unknown9);
            buffer.put(unknown10);
            buffer.put(unknown11);
            short prefix_unknown12;
            if (unknown12 == null)
            {
                prefix_unknown12 = 0;
            }
            else
            {
                prefix_unknown12 = (short) unknown12.length;
            }
            buffer.putShort(prefix_unknown12);
            
            for (int i = 0; i < prefix_unknown12; i++)
            {
                buffer.putChar(unknown12[i]);
            }
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}