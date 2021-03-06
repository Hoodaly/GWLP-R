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
public final class P462_PartySearchGeneralAction extends GenericAction
{

    private short localID;
    private short district;
    private byte districtMatch;
    private byte partySize;
    private byte heroes;
    private byte type;
    private byte hardMode;
    private char[] message;
    private char[] characterName;
    private byte primaryProf;
    private byte secondaryProf;
    private byte level;
    private int data13;


    public short getHeader()
    {
        return 462;
    }


    public void setLocalID(short newValue)
    {
        localID = newValue;
    }


    public void setDistrict(short newValue)
    {
        district = newValue;
    }


    public void setDistrictMatch(byte newValue)
    {
        districtMatch = newValue;
    }


    public void setPartySize(byte newValue)
    {
        partySize = newValue;
    }


    public void setHeroes(byte newValue)
    {
        heroes = newValue;
    }


    public void setType(byte newValue)
    {
        type = newValue;
    }


    public void setHardMode(byte newValue)
    {
        hardMode = newValue;
    }


    public void setMessage(char[] newValue)
    {
        message = newValue;
    }


    public void setCharacterName(char[] newValue)
    {
        characterName = newValue;
    }


    public void setPrimaryProf(byte newValue)
    {
        primaryProf = newValue;
    }


    public void setSecondaryProf(byte newValue)
    {
        secondaryProf = newValue;
    }


    public void setLevel(byte newValue)
    {
        level = newValue;
    }


    public void setData13(int newValue)
    {
        data13 = newValue;
    }


    private int getSize()
    {
        int size = 22;

        if (message != null)
        {
            size += 2 * message.length;
        }
        if (characterName != null)
        {
            size += 2 * characterName.length;
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

            buffer.putShort(localID);
            buffer.putShort(district);
            buffer.put(districtMatch);
            buffer.put(partySize);
            buffer.put(heroes);
            buffer.put(type);
            buffer.put(hardMode);
            short prefix_message;
            if (message == null)
            {
                prefix_message = 0;
            }
            else
            {
                prefix_message = (short) message.length;
            }
            buffer.putShort(prefix_message);
            
            for (int i = 0; i < prefix_message; i++)
            {
                buffer.putChar(message[i]);
            }
            short prefix_characterName;
            if (characterName == null)
            {
                prefix_characterName = 0;
            }
            else
            {
                prefix_characterName = (short) characterName.length;
            }
            buffer.putShort(prefix_characterName);
            
            for (int i = 0; i < prefix_characterName; i++)
            {
                buffer.putChar(characterName[i]);
            }
            buffer.put(primaryProf);
            buffer.put(secondaryProf);
            buffer.put(level);
            buffer.putInt(data13);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}