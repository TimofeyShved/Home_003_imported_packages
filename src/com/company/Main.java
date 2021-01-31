package com.company;
import com.max.*;

public class Main {
    public static void main(String[] args) {
        com.max.Humen man1;
        Car car1=new Car();
        System.out.println("Car "+car1.color);
        Car car2= new Car("Red");
        car1.color="green";
        System.out.println("Car "+car1.color);
        System.out.println("Car "+car2.color);
        man1 = new Humen();
        System.out.println("Man "+man1.color);
        // write your code here
    }
}
