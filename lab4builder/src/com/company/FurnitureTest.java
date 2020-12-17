package com.company;
import org.junit.Test;
import static org.junit.Assert.*;

public class FurnitureTest {
    @Test
    public void testDepartment(){
        Furniture furniture=new Furniture();
        int actual=furniture.setPrice(680);
        int expected = 680;
        assertEquals(expected,actual);


    }
}
