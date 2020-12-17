
package com.company;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Furniture> arr = new ArrayList();
        arr.add(new Table("Макс",100));
        arr.add(new Chair("Наталья",400));
        arr.add(new Table("Данила",100));
        arr.add(new Chair("Мария",400));

        Visitor visitor = new FurnitureVisitor();
        for(Furniture a: arr){
            a.accept(visitor);
        }
    }

    @Test
 public void TableTest(){
        ArrayList<Furniture> arr = new ArrayList();
        arr.add(new Table("Макс",100));
        String expected="Макс";
        String actual=arr.get(0).getName();
        assertEquals(expected,actual);
    }

    @Test
    public void ChairTest(){
        ArrayList<Furniture> arr = new ArrayList();
        arr.add(new Chair("Наталья",100));
        String expected="Наталья";
        String actual=arr.get(0).getName();
        assertEquals(expected,actual);
    }
}
