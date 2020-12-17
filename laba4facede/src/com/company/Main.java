package com.company;

import org.junit.*;
import static org.junit.Assert.*;
public class Main {

    public static void main(String[] args) {
	WorkFlow workflow = new WorkFlow();
	workflow.solveProblems();
    }

    @Test
    public void assemblementTest(){

        WorkFlow workflow = new WorkFlow();
        workflow.solveProblems();
        boolean expected=true;
                boolean actual=workflow.assemble.startAssemble();
                assertEquals(expected,actual);
    }
}
