class Employee {
    String name;
    int salary;

    Employee() {
        name = "";
        salary = 0;
    }

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Manager extends Employee {
    int bonus;

    Manager() {
        super();
        bonus = 0;
    }

    Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;

        super.salary += this.bonus;

    }

    void printManagerDetails(){
        System.out.println(super.name);
        System.out.println(super.salary);

    }
}

public class Salary {
    public static void main(String[] args) {
        Manager M1 = new Manager();

        Manager M2 = new Manager("Arvind", 20000, 2000);

        M1.printManagerDetails();
        M2.printManagerDetails();
    }
}