package comparing;

public class Student implements Comparable<Student> {
    int rollNo;
    float marks;

    Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public int compareTo(Student obj) {
        return (int)(this.marks - obj.marks);
    }
}
