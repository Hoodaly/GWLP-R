/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-09-28
 */

package com.gamerevision.gwlpr.actions.loginserver.stoc;

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
public final class P035_UnknownAction extends GenericAction
{

    private int unknown1;
    private int unknown2;
    private byte[] unknown3;
    private byte[] unknown4;
    private byte[] unknown5;
    private char[] unknown6;


    public short getHeader()
    {
        return 35;
    }


    public void setUnknown1(int newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(int newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(byte[] newValue)
    {
        unknown3 = newValue;
    }


    public void setUnknown4(byte[] newValue)
    {
        unknown4 = newValue;
    }


    public void setUnknown5(byte[] newValue)
    {
        unknown5 = newValue;
    }


    public void setUnknown6(char[] newValue)
    {
        unknown6 = newValue;
    }


    private int getSize()
    {
        int size = 60;

        if (unknown3 == null)
        {
            return 0;
        }
        
        if (unknown3.length != 16)
        {
            return 0;
        }
        if (unknown4 == null)
        {
            return 0;
        }
        
        if (unknown4.length != 16)
        {
            return 0;
        }
        if (unknown5 == null)
        {
            return 0;
        }
        
        if (unknown5.length != 16)
        {
            return 0;
        }
        if (unknown6 != null)
        {
            size += 2 * unknown6.length;
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
            buffer.putInt(unknown2);
            for (int i = 0; i < 16; i++)
            {
                buffer.put(unknown3[i]);
            }
            for (int i = 0; i < 16; i++)
            {
                buffer.put(unknown4[i]);
            }
            for (int i = 0; i < 16; i++)
            {
                buffer.put(unknown5[i]);
            }
            short prefix_unknown6;
            if (unknown6 == null)
            {
                prefix_unknown6 = 0;
            }
            else
            {
                prefix_unknown6 = (short) unknown6.length;
            }
            buffer.putShort(prefix_unknown6);
            
            for (int i = 0; i < prefix_unknown6; i++)
            {
                buffer.putChar(unknown6[i]);
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