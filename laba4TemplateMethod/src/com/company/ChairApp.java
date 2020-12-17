package com.company;

public class ChairApp extends AssembleTemplate{
    @Override
    public String appContent() {
        System.out.println("Chair is made from plastic and wood");
        return ("Chair is made from plastic and wood");
    }
}
