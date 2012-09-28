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
 *
 * @author GWLPR Template Updater
 */
public final class P321_MoveItemAction extends GenericAction
{

    private short itemStreamID;
    private int itemLocalID;
    private short pageID;
    private byte slot;


    public short getHeader()
    {
        return 321;
    }


    public void setItemStreamID(short newValue)
    {
        itemStreamID = newValue;
    }


    public void setItemLocalID(int newValue)
    {
        itemLocalID = newValue;
    }


    public void setPageID(short newValue)
    {
        pageID = newValue;
    }


    public void setSlot(byte newValue)
    {
        slot = newValue;
    }


    private int getSize()
    {
        return 11;
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

            buffer.putShort(itemStreamID);
            buffer.putInt(itemLocalID);
            buffer.putShort(pageID);
            buffer.put(slot);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}