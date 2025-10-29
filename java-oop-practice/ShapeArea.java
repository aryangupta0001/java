/*
4️⃣ Shape Area Calculator

🧩 Concept: Method Overriding
⚙️ Create a base class Shape with a method area().
Extend to Circle and Rectangle and override area() appropriately.
💡 Hint: Use polymorphism to call area() on different obj
*/

class Shape {
    void area() {
        return;
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Area Of Circle : " + 3.14 * radius * radius);
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("Area Of Circle : " + length * breadth);
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Rectangle R = new Rectangle(10, 5);

        Circle C = new Circle(7);

        R.area();
        C.area();
    }
}
