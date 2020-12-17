package com.company;

public  class Furniture {
    public void doJobBeforeData(Assemble process){

        if(process.isActiveAssemble())
        {
            System.out.println("Robot is assembling furniture");
        }else{
            System.out.println("robot is just chilling");
        }

    }
}
