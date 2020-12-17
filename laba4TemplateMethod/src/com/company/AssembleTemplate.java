package com.company;

public abstract class AssembleTemplate {

    public void showApp(){
        System.out.println("fueling the robot materials");
    appContent();
        System.out.println("adding the product into the database");
    }
    public abstract String appContent();
}
