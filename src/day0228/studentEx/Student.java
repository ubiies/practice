package day0228.studentEx;

public class Student implements Comparable<Student> {
    private int studentNo;
    private String name;
    private String department;

    public Student(int studentNo, String name, String department) {
        this.studentNo = studentNo;
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.department + ", " + this.studentNo + ", " + this.name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public int compareTo(Student student) {
        return this.studentNo - student.studentNo;
    }
}
