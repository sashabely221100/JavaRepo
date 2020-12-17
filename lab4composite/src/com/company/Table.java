package com.company;

public class Table extends Furniture {
    @Override
    public String assemble() {
        System.out.println("Table is being assembled...");
    return ("Table is being assembled...");
    }

    @Override
    public void addFurniture(Furniture furniture) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeFurniture(Furniture furniture) {
        throw new UnsupportedOperationException();
    }
}