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
public final class P075_NPCModelAction extends GenericAction
{

    private int localID;
    private int[] modelFile;


    public short getHeader()
    {
        return 75;
    }


    public void setLocalID(int newValue)
    {
        localID = newValue;
    }


    public void setModelFile(int[] newValue)
    {
        modelFile = newValue;
    }


    private int getSize()
    {
        int size = 8;

        if (modelFile != null)
        {
            size += 4 * modelFile.length;
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

            buffer.putInt(localID);
            short prefix_modelFile;
            if (modelFile == null)
            {
                prefix_modelFile = 0;
            }
            else
            {
                prefix_modelFile = (short) modelFile.length;
            }
            buffer.putShort(prefix_modelFile);
            
            for (int i = 0; i < prefix_modelFile; i++)
            {
                buffer.putInt(modelFile[i]);
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