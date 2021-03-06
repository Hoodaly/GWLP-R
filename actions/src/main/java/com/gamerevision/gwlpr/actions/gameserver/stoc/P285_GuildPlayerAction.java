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
 * This is used to display players in the guild window. 
 * After a guild player has been created, you can send 
 * the packet again with the same primary name to update 
 * their info. (e.g set them offline) 
 *
 * @author GWLPR Template Updater
 */
public final class P285_GuildPlayerAction extends GenericAction
{

    private char[] primaryName;
    private char[] displayName;
    private char[] invitedBy;
    private char[] contextInfo;
    private int data5;
    private int lastLoggedOn;
    private int joinDate;
    private int status;
    private byte memberType;


    public short getHeader()
    {
        return 285;
    }


    /**
     * The player's primary name (the one they were invited 
     * with) 
     */
    public void setPrimaryName(char[] newValue)
    {
        primaryName = newValue;
    }


    /**
     * The player's name displayed in the guild window 
     */
    public void setDisplayName(char[] newValue)
    {
        displayName = newValue;
    }


    public void setInvitedBy(char[] newValue)
    {
        invitedBy = newValue;
    }


    /**
     * Information displayed in the context menu when you 
     * hover over the player (such as who promoted them) 
     */
    public void setContextInfo(char[] newValue)
    {
        contextInfo = newValue;
    }


    public void setData5(int newValue)
    {
        data5 = newValue;
    }


    /**
     * The number of minutes since the player was last online 
     */
    public void setLastLoggedOn(int newValue)
    {
        lastLoggedOn = newValue;
    }


    public void setJoinDate(int newValue)
    {
        joinDate = newValue;
    }


    public void setStatus(int newValue)
    {
        status = newValue;
    }


    public void setMemberType(byte newValue)
    {
        memberType = newValue;
    }


    private int getSize()
    {
        int size = 27;

        if (primaryName != null)
        {
            size += 2 * primaryName.length;
        }
        if (displayName != null)
        {
            size += 2 * displayName.length;
        }
        if (invitedBy != null)
        {
            size += 2 * invitedBy.length;
        }
        if (contextInfo != null)
        {
            size += 2 * contextInfo.length;
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

            short prefix_primaryName;
            if (primaryName == null)
            {
                prefix_primaryName = 0;
            }
            else
            {
                prefix_primaryName = (short) primaryName.length;
            }
            buffer.putShort(prefix_primaryName);
            
            for (int i = 0; i < prefix_primaryName; i++)
            {
                buffer.putChar(primaryName[i]);
            }
            short prefix_displayName;
            if (displayName == null)
            {
                prefix_displayName = 0;
            }
            else
            {
                prefix_displayName = (short) displayName.length;
            }
            buffer.putShort(prefix_displayName);
            
            for (int i = 0; i < prefix_displayName; i++)
            {
                buffer.putChar(displayName[i]);
            }
            short prefix_invitedBy;
            if (invitedBy == null)
            {
                prefix_invitedBy = 0;
            }
            else
            {
                prefix_invitedBy = (short) invitedBy.length;
            }
            buffer.putShort(prefix_invitedBy);
            
            for (int i = 0; i < prefix_invitedBy; i++)
            {
                buffer.putChar(invitedBy[i]);
            }
            short prefix_contextInfo;
            if (contextInfo == null)
            {
                prefix_contextInfo = 0;
            }
            else
            {
                prefix_contextInfo = (short) contextInfo.length;
            }
            buffer.putShort(prefix_contextInfo);
            
            for (int i = 0; i < prefix_contextInfo; i++)
            {
                buffer.putChar(contextInfo[i]);
            }
            buffer.putInt(data5);
            buffer.putInt(lastLoggedOn);
            buffer.putInt(joinDate);
            buffer.putInt(status);
            buffer.put(memberType);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}