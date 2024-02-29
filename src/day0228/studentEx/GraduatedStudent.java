package day0228.studentEx;

public class GraduatedStudent extends Student {
    private String major;

    public GraduatedStudent(int studentNo, String name, String department, String major) {
        super(studentNo, name, department);
        this.major = major;
    }

    public String toString() {
        return this.major;
    }
    
}
