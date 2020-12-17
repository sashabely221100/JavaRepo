package com.company;


public class Table extends Furniture {
    public Table(String name, int price) {
        super(name,price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
