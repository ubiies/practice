package day0227.Quiz;

public class Student implements Comparable<Student> {
    private int studentNo;
    private String name;
    
    public Student(int studentNo, String name) {
        this.studentNo = studentNo;
        this.name = name;
    }

    public int getStudentNo() {
        return this.studentNo;
    }

    public String getName() {
        return this.name;
    }

    // Grater than: returns positive integer
    // Equals to: returns 0
    // Less than: returns negative integer
    @Override
    public int compareTo(Student student) {
        if(this.studentNo > student.getStudentNo()) {
            return 1;
        } else if (this.studentNo == student.getStudentNo()) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return this.studentNo + ", " + this.name;
    }
}
