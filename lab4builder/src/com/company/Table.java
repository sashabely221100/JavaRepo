package com.company;

public class Table extends FurnitureBuilder {
    @Override
    void buildMaterial() {
        furniture.setMaterial("Red Wood");
    }

    @Override
    void buildName() {furniture.setName("Victoria");}

    @Override
    void buildDepartment() {
        furniture.setDepartment(Department.table);
    }

    @Override
    void buildPrice() {
        furniture.setPrice(680);
    }
}
