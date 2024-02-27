package day0227;

public class Student extends Member {
    private String department;

    // Constructor
    // super class..의.. 객체 생성
    public Student(int no, String name, String department) {
        super(no, name);
        this.department = department;
    }
}

class Test2 {
    public static void main(String[] args) {
        
    }
}