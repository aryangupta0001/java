/*

2️⃣ Rectangle Area Comparison

🧩 Concept: Constructors & Methods
⚙️ Make a Rectangle class with length & breadth.
Add methods to calculate area & perimeter. Compare two rectangle objects.
💡 Hint: Use this keyword to refer to current object.

*/

class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    long getPerimeter() {
        return 2 * (length + breadth);
    }

    long getArea() {
        return length * breadth;
    }

}

public class AreaComparision {

    public static void main(String[] args) {

        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle(3, 8);

        R1.length = 2;
        R1.breadth = 10;

        if (R1.getArea() > R2.getArea())
            System.out.println("R1 Area is larger");

        else
            System.out.println("R2 Area is larger");

        if (R1.getPerimeter() > R2.getPerimeter())
            System.out.println("R1 Perimeter is larger");

        else
            System.out.println("R2 Perimeter is larger");
    }

}