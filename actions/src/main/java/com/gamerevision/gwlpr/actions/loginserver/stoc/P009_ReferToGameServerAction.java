/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-09-28
 */

package com.gamerevision.gwlpr.actions.loginserver.stoc;

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
public final class P009_ReferToGameServerAction extends GenericAction
{

    private int loginCount;
    private int securityKey1;
    private int gameMapID;
    private byte[] serverConnectionInfo;
    private int securityKey2;


    public short getHeader()
    {
        return 9;
    }


    public void setLoginCount(int newValue)
    {
        loginCount = newValue;
    }


    public void setSecurityKey1(int newValue)
    {
        securityKey1 = newValue;
    }


    public void setGameMapID(int newValue)
    {
        gameMapID = newValue;
    }


    public void setServerConnectionInfo(byte[] newValue)
    {
        serverConnectionInfo = newValue;
    }


    public void setSecurityKey2(int newValue)
    {
        securityKey2 = newValue;
    }


    private int getSize()
    {
        int size = 42;

        if (serverConnectionInfo == null)
        {
            return 0;
        }
        
        if (serverConnectionInfo.length != 24)
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

            buffer.putInt(loginCount);
            buffer.putInt(securityKey1);
            buffer.putInt(gameMapID);
            for (int i = 0; i < 24; i++)
            {
                buffer.put(serverConnectionInfo[i]);
            }
            buffer.putInt(securityKey2);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}