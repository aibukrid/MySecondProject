package ru.stqa.pft.sandbox;

public class Tree {

    public double a;
    public double b;
    public double c;
    public double d;

    public Tree (double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double height() {
        return this.a * this.b * this.c / this.d / this.b;
    }
}