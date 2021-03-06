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
public final class P149_PlayEffectAction extends GenericAction
{

    private float[] position;
    private short plane;
    private int agentID;
    private short effectID;
    private byte data5;
    private byte data6;


    public short getHeader()
    {
        return 149;
    }


    /**
     * the x/y-coordinates 
     */
    public void setPosition(float[] newValue)
    {
        position = newValue;
    }


    public void setPlane(short newValue)
    {
        plane = newValue;
    }


    public void setAgentID(int newValue)
    {
        agentID = newValue;
    }


    public void setEffectID(short newValue)
    {
        effectID = newValue;
    }


    public void setData5(byte newValue)
    {
        data5 = newValue;
    }


    public void setData6(byte newValue)
    {
        data6 = newValue;
    }


    private int getSize()
    {
        int size = 20;

        if (position == null)
        {
            return 0;
        }
        
        if (position.length != 2)
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

            buffer.putFloat(position[0]);
            buffer.putFloat(position[1]);
            buffer.putShort(plane);
            buffer.putInt(agentID);
            buffer.putShort(effectID);
            buffer.put(data5);
            buffer.put(data6);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}