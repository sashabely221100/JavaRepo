package com.company;

public class AssembleController {
    public static void main(String[] args) {
       AssembleTemplate chairApp = new ChairApp();
        AssembleTemplate tableApp = new TableApp();
        chairApp.showApp();

        System.out.println("\n==========\n");

        tableApp.showApp();
    }
}

