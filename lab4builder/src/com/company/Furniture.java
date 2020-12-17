package com.company;

public class Furniture {
    private String material;
    private String name;
    private Department department;
    private int price;

    public String setMaterial(String material) {
        this.material = material;
        return material;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int setPrice(int price) {
        this.price = price;
        return price;
    }

    @Override
    public java.lang.String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", name='" + name + '\'' +
                ", type=" + department +
                ", price='" + price + '\'' +
                '}';
    }


}
