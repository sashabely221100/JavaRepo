package com.company;

public class Main {
    public static void main(String[] args){
        Admin admin = new Admin();
        admin.setBuilder(new Table());
        Furniture furniture = admin.buildFurniture();
        System.out.println(furniture);

        admin.setBuilder(new Chair());
        Furniture furniture1=admin.buildFurniture();
        System.out.println(furniture1);
    }
}
