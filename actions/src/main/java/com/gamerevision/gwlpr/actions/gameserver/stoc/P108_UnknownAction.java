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
public final class P108_UnknownAction extends GenericAction
{

    public final class NestedUnknown2
    {
    
        private short unknown3;
        private byte unknown4;
        private int unknown5;
        private int unknown6;
        private byte unknown7;


        public void setUnknown3(short newValue)
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


        private int getSize()
        {
            return 12;
        }


        public boolean serialize(ByteBuffer buffer)
        {
            try
            {
                buffer.putShort(unknown3);
                buffer.put(unknown4);
                buffer.putInt(unknown5);
                buffer.putInt(unknown6);
                buffer.put(unknown7);
            }
            catch (BufferOverflowException e)
            {
                return false;
            }

            return true;
        }
    }


    private byte unknown1;
    private NestedUnknown2[] unknown2;


    public short getHeader()
    {
        return 108;
    }


    public void setUnknown1(byte newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(NestedUnknown2[] newValue)
    {
        unknown2 = newValue;
    }


    private int getSize()
    {
        int size = 4;

        if (unknown2 != null)
        {
            for (NestedUnknown2 entry : unknown2)
            {
                int nextSize = entry.getSize();
        
                if (nextSize == 0)
                {
                    return 0;
                }
        
                size += entry.getSize();
            }
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

            buffer.put(unknown1);
            byte prefix_unknown2;
            if (unknown2 == null)
            {
                prefix_unknown2 = 0;
            }
            else
            {
                prefix_unknown2 = (byte) unknown2.length;
            }
            buffer.put(prefix_unknown2);
            
            for (int i = 0; i < prefix_unknown2; i++)
            {
                if (!unknown2[i].serialize(buffer))
                {
                    return false;
                }
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