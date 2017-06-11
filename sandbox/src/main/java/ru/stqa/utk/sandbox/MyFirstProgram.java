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
        System.out.println("Расстояние между двумя точками " + distance(p1,p2));
    }
    public static void hello(String somebody) {

        System.out.println("Hello " + somebody + "!");
    }
    public static double distance(Point p1, Point p2){
        double distance = Math.sqrt((p2.x - p1.x)* (p2.x - p1.x)  + (p2.y - p1.y)* (p2.y - p1.y));
        return distance;
    }
}


