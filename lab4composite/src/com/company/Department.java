package com.company;

import java.util.ArrayList;
import java.util.List;

public class Department extends Furniture {
    private List<Furniture> furnitures = new ArrayList<Furniture>();

    @Override
    public void addFurniture (Furniture furniture){
        furnitures.add(furniture);
    }

    @Override
    public  void removeFurniture(Furniture furniture){
        furnitures.remove(furniture);
    }

    public String assemble(){
        System.out.println("Department is assembling some furniture...\n");
        for (Furniture furniture: furnitures){
            furniture.assemble();
        }
        return ("Department is assembling some furniture...");
    }
}
