package polymorphism;

public class Circle extends Shapes {

    int r;

    Circle(int r){
        this.r = r;
    }
    void area(){
        System.out.println("Circle");
    }
}