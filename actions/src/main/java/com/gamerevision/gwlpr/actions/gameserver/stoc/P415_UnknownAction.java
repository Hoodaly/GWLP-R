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
public final class P415_UnknownAction extends GenericAction
{

    private short unknown1;
    private byte unknown2;
    private byte unknown3;
    private byte unknown4;
    private byte unknown5;
    private byte unknown6;
    private short unknown7;
    private byte unknown8;
    private int unknown9;
    private int unknown10;
    private char[] unknown11;
    private char[] unknown12;


    public short getHeader()
    {
        return 415;
    }


    public void setUnknown1(short newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(byte newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(byte newValue)
    {
        unknown3 = newValue;
    }


    public void setUnknown4(byte newValue)
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


    public void setUnknown7(short newValue)
    {
        unknown7 = newValue;
    }


    public void setUnknown8(byte newValue)
    {
        unknown8 = newValue;
    }


    public void setUnknown9(int newValue)
    {
        unknown9 = newValue;
    }


    public void setUnknown10(int newValue)
    {
        unknown10 = newValue;
    }


    public void setUnknown11(char[] newValue)
    {
        unknown11 = newValue;
    }


    public void setUnknown12(char[] newValue)
    {
        unknown12 = newValue;
    }


    private int getSize()
    {
        int size = 24;

        if (unknown11 != null)
        {
            size += 2 * unknown11.length;
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

            buffer.putShort(unknown1);
            buffer.put(unknown2);
            buffer.put(unknown3);
            buffer.put(unknown4);
            buffer.put(unknown5);
            buffer.put(unknown6);
            buffer.putShort(unknown7);
            buffer.put(unknown8);
            buffer.putInt(unknown9);
            buffer.putInt(unknown10);
            short prefix_unknown11;
            if (unknown11 == null)
            {
                prefix_unknown11 = 0;
            }
            else
            {
                prefix_unknown11 = (short) unknown11.length;
            }
            buffer.putShort(prefix_unknown11);
            
            for (int i = 0; i < prefix_unknown11; i++)
            {
                buffer.putChar(unknown11[i]);
            }
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