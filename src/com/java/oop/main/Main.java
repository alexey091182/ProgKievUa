package com.java.oop.main;
import com.java.oop.task2.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(10,15,10);
        Triangle triangle2 = new Triangle(12, 10, 10);

        triangle1.calculateArea();
        triangle1.calculatePerimeter();
        System.out.println(triangle1);

        triangle2.calculatePerimeter();
        triangle2.calculateArea();
        System.out.println(triangle2);
    }
}
