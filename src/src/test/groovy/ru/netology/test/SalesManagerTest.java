package ru.netology.test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.SalesManager;

public class SalesManagerTest {
     long[] sales= {4500,6_000_000,800};

    SalesManager salesManager=new SalesManager(sales);

    @Test
    public void maxTest(){

        long result= salesManager.max();
        Assertions.assertEquals(6_000_000,result);

    }
    @Test
    public void minTest(){
        long result= salesManager.min();
        Assertions.assertEquals(800,result);
    }
    @Test
    public void averageTest(){
        long result= salesManager.average();
        Assertions.assertEquals(1000883,result);
    }
}
