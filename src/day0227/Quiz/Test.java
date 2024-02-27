package day0227.Quiz;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Celine");
        Student s2 = new Student(2, "Jason");
        Student s3 = new Student(3,"Minji");

        // java에서 비교 가능한 compareTo method
        System.out.println(s1.compareTo(s2));

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for(Student s : list) {
            System.out.println(s);
        }

        Collections.sort(list);
    }
}
