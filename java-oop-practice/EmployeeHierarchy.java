import java.util.ArrayList;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void showDetails() {
        System.out.println("Name of Person : " + this.name + "\n");
    }
}

class Employee extends Person {
    int empId;
    protected String dept;

    Employee(String name, int empId, String dept) {
        super(name);

        this.empId = empId;
        this.dept = dept;
    }

    void showDetails() {
        System.out.println("Employee Id : " + this.empId);
        System.out.println("Employee Name : " + this.name);
        System.out.println("Employee Dept. : " + this.dept + "\n");
    }
}

class Manager extends Employee {

    ArrayList<Employee> employees = new ArrayList<>();

    Manager(String name, int empId, String dept) {
        super(name, empId, dept);
    }

    void assignSubordinates(Employee e) {
        employees.add(e);
    }

    void showDetails() {
        System.out.println("\nManager Name : " + this.name);
        System.out.println("Manager Id : " + this.empId);
        System.out.println("Manager Dept. : " + this.dept);

        System.out.println("\nEmployees under manager : ");

        for (Employee e : employees) {
            System.out.println(e.empId + "\t" + e.name + "\t" + e.dept);
        }
    }
}

class Director extends Manager {
    String DIN;
    ArrayList<Manager> managers = new ArrayList<>();

    Director(String DIN, String name, int empId, String dept) {
        super(name, empId, dept);
        this.DIN = DIN;
    }

    void assignSubordinates(Manager m){
        managers.add(m);
    }

    void showDetails() {
        System.out.println("\n\nDirector Number : " + this.DIN);
        System.out.println("Director Name : " + this.name);
        System.out.println("Managers under Director : ");

        for (Manager m : managers)
            System.out.println(m.empId + "\t" + m.name + "\t" + m.dept);
    }

}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        
        Person p1 = new Person("Aryan");
        p1.showDetails();

        Employee e1 = new Employee("Arvind", 01, "IT");
        e1.showDetails();

        Manager m1 = new Manager("Tarun", 02, "Account");
        m1.showDetails();

        m1.assignSubordinates(e1);

        Director d1 = new Director("DIN0001", "Bhaskar", 03, "Finance");
        d1.showDetails();

        d1.assignSubordinates(m1);

        m1.showDetails();
        d1.showDetails();
    }
}