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
public final class P146_DisplayDialogueAction extends GenericAction
{

    private int agentID;
    private char[] name;
    private byte type;
    private char[] text;


    public short getHeader()
    {
        return 146;
    }


    /**
     * The agent who is speaking. 
     */
    public void setAgentID(int newValue)
    {
        agentID = newValue;
    }


    /**
     * The name that will appear in the window. 
     */
    public void setName(char[] newValue)
    {
        name = newValue;
    }


    public void setType(byte newValue)
    {
        type = newValue;
    }


    public void setText(char[] newValue)
    {
        text = newValue;
    }


    private int getSize()
    {
        int size = 11;

        if (name != null)
        {
            size += 2 * name.length;
        }
        if (text != null)
        {
            size += 2 * text.length;
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

            buffer.putInt(agentID);
            short prefix_name;
            if (name == null)
            {
                prefix_name = 0;
            }
            else
            {
                prefix_name = (short) name.length;
            }
            buffer.putShort(prefix_name);
            
            for (int i = 0; i < prefix_name; i++)
            {
                buffer.putChar(name[i]);
            }
            buffer.put(type);
            short prefix_text;
            if (text == null)
            {
                prefix_text = 0;
            }
            else
            {
                prefix_text = (short) text.length;
            }
            buffer.putShort(prefix_text);
            
            for (int i = 0; i < prefix_text; i++)
            {
                buffer.putChar(text[i]);
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