package ru.vr.sandbox;

public class Square {
    public int height;

    public Square (int height) {
        this.height = height;
    }

    public int area () {
        return this.height * this.height;
    }
}
