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
public final class P152_UnknownAction extends GenericAction
{

    private int unknown1;
    private float[] unknown2;
    private short unknown3;
    private int unknown4;
    private int unknown5;
    private int unknown6;
    private byte unknown7;


    public short getHeader()
    {
        return 152;
    }


    public void setUnknown1(int newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(float[] newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(short newValue)
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


    public void setUnknown7(byte newValue)
    {
        unknown7 = newValue;
    }


    private int getSize()
    {
        int size = 29;

        if (unknown2 == null)
        {
            return 0;
        }
        
        if (unknown2.length != 2)
        {
            return 0;
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
            buffer.putFloat(unknown2[0]);
            buffer.putFloat(unknown2[1]);
            buffer.putShort(unknown3);
            buffer.putInt(unknown4);
            buffer.putInt(unknown5);
            buffer.putInt(unknown6);
            buffer.put(unknown7);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}