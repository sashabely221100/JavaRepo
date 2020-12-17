package com.company.Factory;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createdeveloperBySpecialty("Java");
        Developer developer= developerFactory.createDeveloper();
        developer.writeCode();

        DeveloperFactory developerFactory2 = createdeveloperBySpecialty("c++");
        Developer developer2= developerFactory2.createDeveloper();
        developer2.writeCode();

        DeveloperFactory developerFactory3 = createdeveloperBySpecialty("php");
        Developer developer3= developerFactory3.createDeveloper();
        developer3.writeCode();




    }
    public static DeveloperFactory createdeveloperBySpecialty(String specialty)
    {
        if(specialty.equalsIgnoreCase("java"))
            {
                return new JavaDeveloperFactory();
            }else if(specialty.equalsIgnoreCase("c++")){
                return new CppDeveloperFactory();

    }else if(specialty.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        }
        else{
                throw new RuntimeException(specialty + " is unknown developer");
    }


    }
    @Test
    public void CreateDevTest(){
        Developer developer=new JavaDeveloper();
        String actual=developer.writeCode();
        String expected="Java developer writes Java code";
    assertEquals(expected,actual);
    }

}
