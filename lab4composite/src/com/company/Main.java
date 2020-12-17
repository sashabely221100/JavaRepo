package com.company;

public class Main {
    public static void main(String[] args) {
        Furniture department = new Department();

        Furniture firstTable = new Table();
        Furniture firstChair = new Chair();
        Furniture secondChair = new Chair();

        department.addFurniture(firstTable);
        department.addFurniture(firstChair);
        department.addFurniture(secondChair);

        department.assemble();

    }
}
