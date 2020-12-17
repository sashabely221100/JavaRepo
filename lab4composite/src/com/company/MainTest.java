package com.company;
import org.junit.Test;

import static org.junit.Assert.*;
public class MainTest {
    @Test
    public void testTableAssemble(){
     Table table=new Table();
     String actual = table.assemble();
String expected="Table is being assembled...";
assertEquals(expected,actual);
    }
    @Test
    public void testChairAssemble(){
        Chair chair=new Chair();
        String actual=chair.assemble();
        String expected="Chair is being assembled...";
        assertEquals(expected,actual);

    }
}
