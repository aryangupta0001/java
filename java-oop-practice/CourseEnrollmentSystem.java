/*
15️⃣ Mini Project: Course Enrollment System

🧩 Concept: All major OOP principles
⚙️ Create:

Course (courseId, courseName, capacity)

Student (id, name, enrolledCourses)

System class with options to enroll, drop, and list students/courses.
💡 Hint: Use ArrayList + encapsulation + object interaction.
*/

import java.util.ArrayList;

class Course {
    int courseId;
    String courseName;
    int capacity;
    int remainingCapacity;

    Course(int courseId, String courseName, int capacity) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.capacity = capacity;
        this.remainingCapacity = capacity;
    }
}

class Student {
    int id;
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class EnrollmentSystem {

    ArrayList<Course> courses = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    Course createCourse(int courseId, String courseName, int capacity) {
        Course C = new Course(courseId, courseName, capacity);
        courses.add(C);

        return C;
    }

    Student createStudent(int id, String name) {
        Student S = new Student(id, name);
        students.add(S);

        return S;
    }

    void enroll(Student S, Course C) {
        if (C.remainingCapacity > 0) {
            S.courses.add(C);

            C.remainingCapacity--;
        }

        else {
            System.out.println("The course capacity is Full");
        }
    }

    void drop(Student S, Course C) {
        if (S.courses.contains(C)) {
            S.courses.remove(C);
            C.remainingCapacity++;
        }

    }

    void listAllCourses() {
        System.out.println("All courses :");

        for (Course c : courses) {
            System.out.println(c.courseId + "\t" + c.courseName + "\t" + c.capacity);
        }

    }

    void listAllStudents() {
        System.out.println("All Students :");

        for (Student s : students) {
            System.out.println("______________________________________________");
            System.out.println(s.id + "\t" + s.name);
            System.out.println("Enrolled Courses :");

            if(s.courses.size() > 0)
                for(Course c : s.courses){
                    System.out.println(c.courseId + "\t" + c.courseName);
                }
            else
                System.out.println("Student is Enrolled in 0 courses");
        }

    }
}

public class CourseEnrollmentSystem {
    public static void main(String[] args) {

        EnrollmentSystem sys = new EnrollmentSystem();

        Course C = sys.createCourse(101, "B.Tech", 100);
        Student S = sys.createStudent(1, "Arvind");

        sys.enroll(S, C);

        C = sys.createCourse(100, "M.Tech", 100);
        S = sys.createStudent(2, "Tarun");

        sys.enroll(S, C);

        sys.listAllStudents();
        sys.listAllCourses();



    }
}
