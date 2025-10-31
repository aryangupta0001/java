/*
11️⃣ Shape Manager

🧩 Concept: Abstract Class
⚙️ Abstract class Shape with area() and perimeter().
Subclasses: Circle, Square, Triangle.
Write a ShapeManager class that takes a list of shapes and prints their area & perimeter.
💡 Hint: Use ArrayList<Shape> and polymorphism.
*/

import java.util.ArrayList;

abstract class Shape {
    abstract void area();
    abstract void perimeter();
}

class Circle extends Shape {

    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Area of Circle : " + 3.14 * this.radius * this.radius);
    }

    void perimeter() {
        System.out.println("Perimeter of Circle : " + 2 * 3.14 * this.radius);
    }
}

class Square extends Shape {

    int side;

    Square(int side) {
        this.side = side;
    }

    void area() {
        System.out.println("Area of square : " + this.side * this.side);
    }

    void perimeter() {
        System.out.println("Perimeter of Square : " + 4 * this.side);
    }
}

class Triangle extends Shape {

    int base, height, hypotenuse;

    Triangle(int base, int height, int hypotenuse) {
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    void area() {
        System.out.println("Are of Triangle : " + 0.5 * this.base * this.height);
    }

    void perimeter() {
        System.out.println("Perimeter of Triangle : " + this.base + this.height + this.hypotenuse);
    }
}

public class ShapeManager {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(10));
        shapes.add(new Square(5));
        shapes.add(new Triangle(2, 3, 5));

        for(Shape S : shapes){
            S.area();
            S.perimeter();
        }
    }
}