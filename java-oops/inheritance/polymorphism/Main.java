package polymorphism;


public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        // Shapes shape;
        // Circle circle = new Circle();
        // Square square = new Square();

        // Shapes sq = new Square();

        // shape.area();
        // Shapes.greet();
        // circle.area();
        // square.area();

        // Square.greet();

        // shape.getA();

        // sq.greet();

        Circle C1 = new Circle(7);
        Circle C2 = new Circle(5);

        System.out.println(C1.equals(C2));

    }
}
