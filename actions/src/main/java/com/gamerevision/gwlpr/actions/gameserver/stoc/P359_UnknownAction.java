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
public final class P359_UnknownAction extends GenericAction
{

    private int unknown1;
    private byte unknown2;
    private int unknown3;
    private int unknown4;
    private int unknown5;
    private int unknown6;
    private int unknown7;
    private int unknown8;
    private byte unknown9;
    private byte unknown10;
    private byte unknown11;
    private byte unknown12;
    private byte unknown13;
    private short unknown14;
    private short unknown15;
    private short unknown16;
    private short unknown17;
    private short unknown18;
    private int unknown19;
    private byte unknown20;
    private byte unknown21;
    private int unknown22;
    private byte unknown23;


    public short getHeader()
    {
        return 359;
    }


    public void setUnknown1(int newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(byte newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(int newValue)
    {
        unknown3 = newValue;
    }


    public void setUnknown4(int newValue)
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


    public void setUnknown7(int newValue)
    {
        unknown7 = newValue;
    }


    public void setUnknown8(int newValue)
    {
        unknown8 = newValue;
    }


    public void setUnknown9(byte newValue)
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


    public void setUnknown12(byte newValue)
    {
        unknown12 = newValue;
    }


    public void setUnknown13(byte newValue)
    {
        unknown13 = newValue;
    }


    public void setUnknown14(short newValue)
    {
        unknown14 = newValue;
    }


    public void setUnknown15(short newValue)
    {
        unknown15 = newValue;
    }


    public void setUnknown16(short newValue)
    {
        unknown16 = newValue;
    }


    public void setUnknown17(short newValue)
    {
        unknown17 = newValue;
    }


    public void setUnknown18(short newValue)
    {
        unknown18 = newValue;
    }


    public void setUnknown19(int newValue)
    {
        unknown19 = newValue;
    }


    public void setUnknown20(byte newValue)
    {
        unknown20 = newValue;
    }


    public void setUnknown21(byte newValue)
    {
        unknown21 = newValue;
    }


    public void setUnknown22(int newValue)
    {
        unknown22 = newValue;
    }


    public void setUnknown23(byte newValue)
    {
        unknown23 = newValue;
    }


    private int getSize()
    {
        return 57;
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
            buffer.put(unknown2);
            buffer.putInt(unknown3);
            buffer.putInt(unknown4);
            buffer.putInt(unknown5);
            buffer.putInt(unknown6);
            buffer.putInt(unknown7);
            buffer.putInt(unknown8);
            buffer.put(unknown9);
            buffer.put(unknown10);
            buffer.put(unknown11);
            buffer.put(unknown12);
            buffer.put(unknown13);
            buffer.putShort(unknown14);
            buffer.putShort(unknown15);
            buffer.putShort(unknown16);
            buffer.putShort(unknown17);
            buffer.putShort(unknown18);
            buffer.putInt(unknown19);
            buffer.put(unknown20);
            buffer.put(unknown21);
            buffer.putInt(unknown22);
            buffer.put(unknown23);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}