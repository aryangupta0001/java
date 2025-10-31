/*
8️⃣ College Database

🧩 Concept: Composition (Has-A relationship)
⚙️ A College has multiple Student objects.
Write a program to display college name and all student details.
💡 Hint: Use an array or ArrayList<Student> as a field in College.
*/

import java.util.ArrayList;

class Student {
    String name;
    String course;
    long roll_no;
    long phone;

    Student() {
        name = "";
        course = "";
        roll_no = 0;
        phone = 0;
    }

    Student(String name, String course, long roll_no, long phone) {
        this.name = name;
        this.course = course;
        this.roll_no = roll_no;
        this.phone = phone;
    }
}

class College {
    String name;
    ArrayList<Student> students;

    College() {
        name = "";
        this.students = new ArrayList<>();

    }

    College(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    void addStudent(String name, String course, long roll_no, long phone) {
        Student S = new Student(name, course, roll_no, phone);
        students.add(S);
    }

    void displayDetails() {
        System.out.println("College Name : " + this.name);

        System.out.println("Stud e nts Details :\n");

        for (Student s : students) {
            System.out.println("Name : " + s.name);
            System.out.println("Course : " + s.course);
            System.out.println("Roll No. : " + s.roll_no);
            System.out.println("Phone : " + s.phone + "\n\n");
        }
    }
}

public class CollegeDatabase {
    public static void main(String[] args) {
        College C = new College("Bly. Clg.");

        C.addStudent("Aryan", "BCA", 202041020066l, 8630508480l);
        C.addStudent("Ajay", "BCA", 202041020013l, 6465684688l);

        C.displayDetails();
    }
}
