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
public final class P328_SwapItemsAction extends GenericAction
{

    private short itemStreamID;
    private int itemLocalID1;
    private int itemLocalID2;


    public short getHeader()
    {
        return 328;
    }


    public void setItemStreamID(short newValue)
    {
        itemStreamID = newValue;
    }


    /**
     * the moved item 
     */
    public void setItemLocalID1(int newValue)
    {
        itemLocalID1 = newValue;
    }


    /**
     * the item to be swapped with 
     */
    public void setItemLocalID2(int newValue)
    {
        itemLocalID2 = newValue;
    }


    private int getSize()
    {
        return 12;
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
            buffer.putInt(itemLocalID1);
            buffer.putInt(itemLocalID2);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}