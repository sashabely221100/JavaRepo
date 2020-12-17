package com.company;

public class Admin {
    FurnitureBuilder builder;

    public void setBuilder(FurnitureBuilder builder) {
        this.builder = builder;
    }

    Furniture buildFurniture(){
        builder.createFurniture();
        builder.buildMaterial();
        builder.buildName();
        builder.buildDepartment();
        builder.buildPrice();

        Furniture furniture = builder.getFurniture();

        return furniture;
    }
}
