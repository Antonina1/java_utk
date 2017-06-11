package ru.stqa.utk.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("World");
        hello("Tonia");
        hello("All");

        Square s = new Square(5);

        System.out.println("Площадь квадрата с одной стороной " + s.l + "=" + s.area());

        Rectangle r =new Rectangle(4,6);

        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        Point p1 = new Point(2,5);
        Point p2 =new Point(6,7);
        System.out.println("Расстояние между двумя точками " + Point.distance(p1,p2));
    }
    public static void hello(String somebody) {

        System.out.println("Hello " + somebody + "!");
    }

}


