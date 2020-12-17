package com.company;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssembleTemplateTest {
@Test
public void testChairAppContent(){
    ChairApp chairApp=new ChairApp();
    String actual=chairApp.appContent();
    String expected="Chair is made from plastic and wood";
    assertEquals(expected,actual);

}

@Test
    public void testTableAppContent(){
 TableApp tableApp=new TableApp();
String actual=tableApp.appContent();
String expected="Table is made from plastic and wood";
assertEquals(expected,actual);
    }
}
