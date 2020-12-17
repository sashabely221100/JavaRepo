package com.company;

public class TableApp extends AssembleTemplate {
    @Override
    public String appContent() {
        System.out.println("Table is made from wood and aluminium");
        return ("Table is made from plastic and wood");
    }
}
