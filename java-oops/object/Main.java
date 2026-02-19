abstract class Shapes {
    public abstract void area();

    public abstract void perimeter();
}

class Rectangle extends Shapes {
    int L, B;

    Rectangle(int L, int B) {
        this.L = L;
        this.B = B;
    }

    boolean equals(Rectangle R) {
        if (this == R)
            return true;

        if (this.L == R.L)
            if (this.B == R.B)
                return true;

        return false;
    }

    public void area(){
        System.out.println("Area : " + this.L * this.B);
    }

    public void perimeter(){
        System.out.println("Perimeter : " + 2*(this.L + this.B));
    }
}

class Isolated {
    Isolated() {
        System.out.println("This is isolated");
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(2, 9);
        Rectangle R2 = new Rectangle(2, 9);

        // Rectangle R2 = R1;

        // System.out.println(R1 == R2);
        // System.out.println(R1.equals(R2));

        System.out.println(R1 instanceof Shapes);

        Shapes obj = new Rectangle(9, 8);

        obj.area();
        obj.perimeter();


    
    }
}
