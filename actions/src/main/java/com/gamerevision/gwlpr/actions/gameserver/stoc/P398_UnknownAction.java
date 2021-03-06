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
public final class P398_UnknownAction extends GenericAction
{

    public final class NestedUnknown7
    {
    
        private byte unknown8;
        private byte unknown9;
        private byte unknown10;
        private byte unknown11;
        private byte unknown12;
        private byte unknown13;
        private byte unknown14;
        private short unknown15;
        private byte unknown16;
        private char[] unknown17;


        public void setUnknown8(byte newValue)
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


        public void setUnknown14(byte newValue)
        {
            unknown14 = newValue;
        }


        public void setUnknown15(short newValue)
        {
            unknown15 = newValue;
        }


        public void setUnknown16(byte newValue)
        {
            unknown16 = newValue;
        }


        public void setUnknown17(char[] newValue)
        {
            unknown17 = newValue;
        }


        private int getSize()
        {
            int size = 12;

            if (unknown17 != null)
            {
                size += 2 * unknown17.length;
            }

            return size;
        }


        public boolean serialize(ByteBuffer buffer)
        {
            try
            {
                buffer.put(unknown8);
                buffer.put(unknown9);
                buffer.put(unknown10);
                buffer.put(unknown11);
                buffer.put(unknown12);
                buffer.put(unknown13);
                buffer.put(unknown14);
                buffer.putShort(unknown15);
                buffer.put(unknown16);
                short prefix_unknown17;
                if (unknown17 == null)
                {
                    prefix_unknown17 = 0;
                }
                else
                {
                    prefix_unknown17 = (short) unknown17.length;
                }
                buffer.putShort(prefix_unknown17);
                
                for (int i = 0; i < prefix_unknown17; i++)
                {
                    buffer.putChar(unknown17[i]);
                }
            }
            catch (BufferOverflowException e)
            {
                return false;
            }

            return true;
        }
    }


    private int unknown1;
    private short unknown2;
    private short unknown3;
    private byte unknown4;
    private byte unknown5;
    private byte unknown6;
    private NestedUnknown7[] unknown7;


    public short getHeader()
    {
        return 398;
    }


    public void setUnknown1(int newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(short newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(short newValue)
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


    public void setUnknown7(NestedUnknown7[] newValue)
    {
        unknown7 = newValue;
    }


    private int getSize()
    {
        int size = 14;

        if (unknown7 != null)
        {
            for (NestedUnknown7 entry : unknown7)
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

            buffer.putInt(unknown1);
            buffer.putShort(unknown2);
            buffer.putShort(unknown3);
            buffer.put(unknown4);
            buffer.put(unknown5);
            buffer.put(unknown6);
            byte prefix_unknown7;
            if (unknown7 == null)
            {
                prefix_unknown7 = 0;
            }
            else
            {
                prefix_unknown7 = (byte) unknown7.length;
            }
            buffer.put(prefix_unknown7);
            
            for (int i = 0; i < prefix_unknown7; i++)
            {
                if (!unknown7[i].serialize(buffer))
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