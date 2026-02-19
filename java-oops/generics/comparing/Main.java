package comparing;

public class Main {
    public static void main(String[] args) {
        Student aryan = new Student(1, 70);
        Student arvind = new Student(3, 80);
        
        if (aryan.compareTo(arvind) < 1){
            System.out.println(aryan.compareTo(arvind));
            System.out.println("Aryan has more marks than Arvind");
        }

        else
            System.out.println("Arvind has more marks than Aryan");
    }
}
