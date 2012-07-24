/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-07-19
 */

package com.gamerevision.gwlpr.actions.gameserver.stoc;

import com.realityshard.shardlet.GenericAction;
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
public final class P317_WeaponBarItemAction extends GenericAction
{

    private short itemStreamID;
    private byte slot;
    private int leadHand;
    private int offHand;


    public short getHeader()
    {
        return 317;
    }


    public void setItemStreamID(short newValue)
    {
        itemStreamID = newValue;
    }


    public void setSlot(byte newValue)
    {
        slot = newValue;
    }


    public void setLeadHand(int newValue)
    {
        leadHand = newValue;
    }


    public void setOffHand(int newValue)
    {
        offHand = newValue;
    }


    private int getSize()
    {
        return 13;
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
            buffer.put(slot);
            buffer.putInt(leadHand);
            buffer.putInt(offHand);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}