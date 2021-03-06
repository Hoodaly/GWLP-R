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
public final class P104_UnknownAction extends GenericAction
{

    private short unknown1;
    private byte unknown2;
    private byte unknown3;
    private byte unknown4;
    private int unknown5;
    private int unknown6;
    private byte unknown7;
    private byte unknown8;
    private int unknown9;
    private int unknown10;
    private int unknown11;
    private int unknown12;
    private int unknown13;
    private int unknown14;
    private int unknown15;
    private int unknown16;
    private int unknown17;
    private int unknown18;
    private int unknown19;
    private char[] unknown20;


    public short getHeader()
    {
        return 104;
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


    public void setUnknown5(int newValue)
    {
        unknown5 = newValue;
    }


    public void setUnknown6(int newValue)
    {
        unknown6 = newValue;
    }


    public void setUnknown7(byte newValue)
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


    public void setUnknown11(int newValue)
    {
        unknown11 = newValue;
    }


    public void setUnknown12(int newValue)
    {
        unknown12 = newValue;
    }


    public void setUnknown13(int newValue)
    {
        unknown13 = newValue;
    }


    public void setUnknown14(int newValue)
    {
        unknown14 = newValue;
    }


    public void setUnknown15(int newValue)
    {
        unknown15 = newValue;
    }


    public void setUnknown16(int newValue)
    {
        unknown16 = newValue;
    }


    public void setUnknown17(int newValue)
    {
        unknown17 = newValue;
    }


    public void setUnknown18(int newValue)
    {
        unknown18 = newValue;
    }


    public void setUnknown19(int newValue)
    {
        unknown19 = newValue;
    }


    public void setUnknown20(char[] newValue)
    {
        unknown20 = newValue;
    }


    private int getSize()
    {
        int size = 63;

        if (unknown20 != null)
        {
            size += 2 * unknown20.length;
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
            buffer.putInt(unknown5);
            buffer.putInt(unknown6);
            buffer.put(unknown7);
            buffer.put(unknown8);
            buffer.putInt(unknown9);
            buffer.putInt(unknown10);
            buffer.putInt(unknown11);
            buffer.putInt(unknown12);
            buffer.putInt(unknown13);
            buffer.putInt(unknown14);
            buffer.putInt(unknown15);
            buffer.putInt(unknown16);
            buffer.putInt(unknown17);
            buffer.putInt(unknown18);
            buffer.putInt(unknown19);
            short prefix_unknown20;
            if (unknown20 == null)
            {
                prefix_unknown20 = 0;
            }
            else
            {
                prefix_unknown20 = (short) unknown20.length;
            }
            buffer.putShort(prefix_unknown20);
            
            for (int i = 0; i < prefix_unknown20; i++)
            {
                buffer.putChar(unknown20[i]);
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