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
public final class P017_AccountPermissionsAction extends GenericAction
{

    private int loginCount;
    private int territory;
    private int territoryChanges;
    private byte[] data1;
    private byte[] data2;
    private byte[] data3;
    private byte[] data4;
    private int changeAccountSettings;
    private byte[] accountFeatures;
    private byte eulaAccepted;
    private int data5;


    public short getHeader()
    {
        return 17;
    }


    public void setLoginCount(int newValue)
    {
        loginCount = newValue;
    }


    public void setTerritory(int newValue)
    {
        territory = newValue;
    }


    public void setTerritoryChanges(int newValue)
    {
        territoryChanges = newValue;
    }


    public void setData1(byte[] newValue)
    {
        data1 = newValue;
    }


    public void setData2(byte[] newValue)
    {
        data2 = newValue;
    }


    public void setData3(byte[] newValue)
    {
        data3 = newValue;
    }


    public void setData4(byte[] newValue)
    {
        data4 = newValue;
    }


    public void setChangeAccountSettings(int newValue)
    {
        changeAccountSettings = newValue;
    }


    public void setAccountFeatures(byte[] newValue)
    {
        accountFeatures = newValue;
    }


    public void setEulaAccepted(byte newValue)
    {
        eulaAccepted = newValue;
    }


    public void setData5(int newValue)
    {
        data5 = newValue;
    }


    private int getSize()
    {
        int size = 73;

        if (data1 == null)
        {
            return 0;
        }
        
        if (data1.length != 8)
        {
            return 0;
        }
        if (data2 == null)
        {
            return 0;
        }
        
        if (data2.length != 8)
        {
            return 0;
        }
        if (data3 == null)
        {
            return 0;
        }
        
        if (data3.length != 16)
        {
            return 0;
        }
        if (data4 == null)
        {
            return 0;
        }
        
        if (data4.length != 16)
        {
            return 0;
        }
        if (accountFeatures != null)
        {
            size += 1 * accountFeatures.length;
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
            buffer.putInt(territory);
            buffer.putInt(territoryChanges);
            for (int i = 0; i < 8; i++)
            {
                buffer.put(data1[i]);
            }
            for (int i = 0; i < 8; i++)
            {
                buffer.put(data2[i]);
            }
            for (int i = 0; i < 16; i++)
            {
                buffer.put(data3[i]);
            }
            for (int i = 0; i < 16; i++)
            {
                buffer.put(data4[i]);
            }
            buffer.putInt(changeAccountSettings);
            short prefix_accountFeatures;
            if (accountFeatures == null)
            {
                prefix_accountFeatures = 0;
            }
            else
            {
                prefix_accountFeatures = (short) accountFeatures.length;
            }
            buffer.putShort(prefix_accountFeatures);
            
            for (int i = 0; i < prefix_accountFeatures; i++)
            {
                buffer.put(accountFeatures[i]);
            }
            buffer.put(eulaAccepted);
            buffer.putInt(data5);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}