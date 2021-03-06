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
public final class P341_UnknownAction extends GenericAction
{

    private int unknown1;
    private int unknown2;
    private byte unknown3;
    private byte unknown4;
    private short unknown5;
    private short unknown6;
    private byte unknown7;
    private int unknown8;
    private int unknown9;


    public short getHeader()
    {
        return 341;
    }


    public void setUnknown1(int newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(int newValue)
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


    public void setUnknown5(short newValue)
    {
        unknown5 = newValue;
    }


    public void setUnknown6(short newValue)
    {
        unknown6 = newValue;
    }


    public void setUnknown7(byte newValue)
    {
        unknown7 = newValue;
    }


    public void setUnknown8(int newValue)
    {
        unknown8 = newValue;
    }


    public void setUnknown9(int newValue)
    {
        unknown9 = newValue;
    }


    private int getSize()
    {
        return 25;
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
            buffer.putInt(unknown2);
            buffer.put(unknown3);
            buffer.put(unknown4);
            buffer.putShort(unknown5);
            buffer.putShort(unknown6);
            buffer.put(unknown7);
            buffer.putInt(unknown8);
            buffer.putInt(unknown9);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}