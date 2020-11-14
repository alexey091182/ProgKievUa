package com.java.oop.task2;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double area;
    private double perimeter;

    public Triangle() {}

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    public double calculatePerimeter() {
        return this.perimeter = sideA + sideB + sideC;

    }

    public double calculateArea(){
        double p =  this.calculatePerimeter() / 2;
        return this.area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }
}
