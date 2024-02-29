package day0229;

import java.util.List;

import day0228.studentEx.Student;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * E는 Comparable이 아니면 들어올 수 없게 명시
 */
public class MyList<E extends Comparable<E>> implements Iterable<E> {
    private List<E> list;
    
    public MyList() {
        this.list = new ArrayList<>();
    }

    public void sort() {
        Collections.sort(this.list);
    }

    // 내가 만든 조건으로 정렬하기 위해 Comparator 객체를 던져줌
    public void sort(Comparator<E> comparator) {
        Collections.sort(this.list, comparator);
    }

    public List<E> getList() {
        return this.list;
    }

    public void add(E element) {
        this.list.add(element);
    }

    @Override
    public Iterator<E> iterator() {
        return this.list.iterator();
    }
}

class Test2 {
    public static void main(String[] args) {
        /*
         * Generic은 참조 타입만 가능 
         * data 타입은 들어갈 수 없음
         */
        MyList<Student> list = new MyList<>();
        list.add(new Student(1, "eunbi", "CE"));
        list.add(new Student(2, "sanghun", "CE"));
        list.add(new Student(3, "celine", "CE"));
        /*
         * foreach의 대상은 iterate 타입이 되어야 함
         */
        list.sort();
        for(Student student:list) {
            System.out.println(student+ " ");
        }
        System.out.println();
        list.sort(new StudentNameComparator());
        for(Student student:list) {
            System.out.println(student+ " ");
        }

        /*
         * 람다식으로 만들면 따로 StudentNameComparator과 같이 클래스를 생성하지 않고도 사용 가능함
         */
        list.sort((Student s1, Student s2) -> s1.getName().compareTo(s2.getName()));
        list.sort((Student s1, Student s2) -> s1.getDepartment().compareTo(s2.getDepartment()));
    }
}

/*
 * Homework
 * student는 comparable인데 무조건 학생 이름으로 sort하게 만들어놓음
 * 근데 학생 이름으로 sort를 하고싶은 경우는 어떻게 ?
 * 
 */
