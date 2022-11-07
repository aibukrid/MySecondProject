package ru.stqa.pft.sandbox;

public class MySecondProject {

    public static void main(String[] args) {
        hello("Radik");
        hello("user");
        hello("Alexei");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        Tree t = new Tree(18, 100, 20, 60);
        System.out.println("Высота дерева" + " = " + t.height());

     }
    public static void hello(String somebody) {
        System.out.println("Hello " + somebody + "!");
    }
}