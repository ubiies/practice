package day0229;

import java.util.Comparator;
import day0228.studentEx.Student;

public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
