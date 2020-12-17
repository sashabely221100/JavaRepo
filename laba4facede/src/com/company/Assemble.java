package com.company;

public class Assemble {
    private boolean isAssemble;

    public boolean isActiveAssemble(){
        return isAssemble;
    }


    public boolean startAssemble(){
        System.out.println("assemble is active");
        isAssemble=true;
return isAssemble;
    }

    public void finishAssemble(){
        System.out.println("assemble is inactive(");
        isAssemble=false;

    }
}
