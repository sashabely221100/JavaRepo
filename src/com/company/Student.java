package com.company;

public class Student {
    String name;
public static void Greet(){
    System.out.println("Thanks for the semester!");
}
    public Student(String name) {
        this.name = name;
        Student.Greet();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
