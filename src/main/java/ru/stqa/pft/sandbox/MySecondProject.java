package ru.stqa.pft.sandbox;

public class MySecondProject {

    public static void main(String[] args) {
        hello("Radik");
        hello("user");
        hello("Alexei");
    }
    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + "!");
    }
}