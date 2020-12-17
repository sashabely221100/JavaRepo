package com.company;

public class Chair extends FurnitureBuilder {
    @Override
    void buildMaterial() {
        furniture.setMaterial("Plastic");
    }

    @Override
    void buildName() {
        furniture.setName("James");
    }

    @Override
    void buildDepartment() {
        furniture.setDepartment(Department.chair);
    }

    @Override
    void buildPrice() {
        furniture.setPrice(320);
    }
}
