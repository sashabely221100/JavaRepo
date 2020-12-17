package com.company;

public class Chair extends Furniture {
    @Override
    public String assemble() {
        System.out.println("Chair is being assembled...");
        return ("Chair is being assembled...");
    }

    @Override
    public void addFurniture(Furniture furniture) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeFurniture(Furniture furniture) {throw new UnsupportedOperationException();
    }
}
