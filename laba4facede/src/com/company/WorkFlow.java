package com.company;

public class WorkFlow {
    Furniture furniture = new Furniture();
    Job job = new Job();
    Assemble assemble = new Assemble();

    public void solveProblems(){
        job.doJob();
        assemble.startAssemble();
        furniture.doJobBeforeData(assemble);

    }

}
