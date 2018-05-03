package ru.vr.sandbox;

public class MyFirstProgram {
    public static void main (String[] args) {
        Square square = new Square(5);
        Triangle triangle = new Triangle(5, 9);

        System.out.println("Area of square 5 is: " + square.area());
        System.out.println("Area of triangle 5 and 9 is: " + triangle.area());
    }
}
