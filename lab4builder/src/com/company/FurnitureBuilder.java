package com.company;

public abstract class FurnitureBuilder {
    Furniture furniture ;

    void createFurniture() {
        furniture = new Furniture();
    }

    abstract void buildMaterial();
    abstract void buildName();
    abstract void buildDepartment();
    abstract void buildPrice();

    Furniture getFurniture(){
        return furniture;
    }
}