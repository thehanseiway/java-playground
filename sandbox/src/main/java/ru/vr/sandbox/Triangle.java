package ru.vr.sandbox;

public class Triangle {
    public int height;
    public int width;

    public Triangle (int height, int width) {
        this.height = height;
        this.width = width;
    }

    public double area () {
        return (this.height * this.width) / 2;
    }
}
