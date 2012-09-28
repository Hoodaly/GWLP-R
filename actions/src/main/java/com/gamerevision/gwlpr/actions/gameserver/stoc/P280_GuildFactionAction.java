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
public final class P280_GuildFactionAction extends GenericAction
{

    private short localID;
    private byte allegiance;
    private int amount;


    public short getHeader()
    {
        return 280;
    }


    public void setLocalID(short newValue)
    {
        localID = newValue;
    }


    public void setAllegiance(byte newValue)
    {
        allegiance = newValue;
    }


    public void setAmount(int newValue)
    {
        amount = newValue;
    }


    private int getSize()
    {
        return 9;
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

            buffer.putShort(localID);
            buffer.put(allegiance);
            buffer.putInt(amount);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}