package com.company;

public class Chair extends Furniture {
    public Chair(String name, int price) {
        super(name,price);

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
