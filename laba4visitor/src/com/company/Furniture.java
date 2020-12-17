package com.company;

public abstract class Furniture {

    private String name;
    public int price;
    public Furniture(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void accept(Visitor visitor);
}
