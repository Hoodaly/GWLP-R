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
public final class P098_UpdateFullAgentEquipmentAction extends GenericAction
{

    private int agentID;
    private int leadhand;
    private int offhand;
    private int chest;
    private int feet;
    private int legs;
    private int arms;
    private int head;
    private int costume;
    private int costumeHead;


    public short getHeader()
    {
        return 98;
    }


    public void setAgentID(int newValue)
    {
        agentID = newValue;
    }


    public void setLeadhand(int newValue)
    {
        leadhand = newValue;
    }


    public void setOffhand(int newValue)
    {
        offhand = newValue;
    }


    public void setChest(int newValue)
    {
        chest = newValue;
    }


    public void setFeet(int newValue)
    {
        feet = newValue;
    }


    public void setLegs(int newValue)
    {
        legs = newValue;
    }


    public void setArms(int newValue)
    {
        arms = newValue;
    }


    public void setHead(int newValue)
    {
        head = newValue;
    }


    public void setCostume(int newValue)
    {
        costume = newValue;
    }


    public void setCostumeHead(int newValue)
    {
        costumeHead = newValue;
    }


    private int getSize()
    {
        return 42;
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

            buffer.putInt(agentID);
            buffer.putInt(leadhand);
            buffer.putInt(offhand);
            buffer.putInt(chest);
            buffer.putInt(feet);
            buffer.putInt(legs);
            buffer.putInt(arms);
            buffer.putInt(head);
            buffer.putInt(costume);
            buffer.putInt(costumeHead);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}