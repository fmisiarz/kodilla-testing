package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
int[] intNumList=new int[20];
        intNumList[0]=1;
        intNumList[1]=2;
        intNumList[2]=3;
        intNumList[3]=4;
        intNumList[4]=5;
        intNumList[5]=6;
        intNumList[6]=7;
        intNumList[7]=8;
        intNumList[8]=9;
        intNumList[9]=10;
        intNumList[10]=11;
        intNumList[11]=12;
        intNumList[12]=13;
        intNumList[13]=14;
        intNumList[14]=15;
        intNumList[15]=16;
        intNumList[16]=17;
        intNumList[17]=18;
        intNumList[18]=19;
        intNumList[19]=20;

double actual =ArrayOperations.getAverage(intNumList);
        Assert.assertEquals(20, intNumList.length);
            Assert.assertEquals(10.5,actual,0.01);
    }
}
