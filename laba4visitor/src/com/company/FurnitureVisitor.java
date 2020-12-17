package com.company;

public class FurnitureVisitor implements Visitor{
    @Override
    public void visit(Table table) {
        System.out.println("Стол - \"" + table.getName()+"\""+" Цена:" + table.getPrice());
    }
    @Override
    public void visit(Chair chair) {
        System.out.println("Стул - \"" + chair.getName()+"\""+" Цена: " + chair.getPrice());
    }

}

