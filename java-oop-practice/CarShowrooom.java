class Car {
    String model;
    long price;
    String color;

    Car() {
        this("Legender", 45000000, "White");
    }

    Car(String model) {
        this(45000000);
        this.model = model;
    }

    Car(long price) {
        this("Legender");
        this.price = price;
    }

    Car(String model, long price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;

    }

    void display() {
        System.out.println(this.model);
        System.out.println(this.price);
        System.out.println(this.color);
    }
}

public class CarShowrooom {
    public static void main(String[] args) {

        Car C1 = new Car();
        C1.display();

        Car C2 = new Car("LC300");
    }
}
