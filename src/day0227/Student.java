package day0227;

public class Student extends Member {
    private String department;
    private int point;

    // Constructor
    // super class..의.. 객체 생성
    public Student(int no, String name, String department) {
        super(no, name);
        this.department = department;
    }

    public Student setDepartment(String department) {
        this.department = department;
        return this;
    }

    public Student setPoint(int point) {
        this.point = point;
        return this;
    }

    @Override
    public String toString() {
        return this.no + ", " + this.name + ", " + this.department;
    }
}

class Test2 {
    public static void main(String[] args) {
        Student s = new Student(1, "James", "CE"); 
        System.out.println(s);
    }
}