package day0227;

/**
 * 캡슐화를 사용한 객체 생성
 */
public class Date {
    // 사용자가 이 데이터를 사용할 방법을 내가 정의하기 위해 private로 선언하는 것이 좋음
    // 사용자가 변수에 직접 액세스 할 수 없게 만드는 기법 -> 캡슐화
    private int year; // 클래스 변수는 반드시 초기화 x
    private int month;
    private int day;

    // Date class의 Super class는 Object 클래스
    /*
     * public Date() {} -> Object 클래스에서 상속 받음
     */
    public Date() {
        // 생성자는 반드시 new 연산자 뒤에 와야됨
        // 생성자는 return 타입을 안씀
        this.year = 1971;
        this.month = 4;
        this.day = 28;
    }

    // getter, setter
    public String getDate() {
        return this.year + "-" + this.month + "-" + this.day;
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return this.year + "";
    }

    public String getMonth() {
        return Integer.toString(this.month);
    }

    public String getDay() {
        return this.day + "";
    }
}

class Test {
    public static void main(String[] args) {
        // Date(); -> 메서드 호출
        // Constructor 생성자 호출
        // 생성자는 자동으로 만들어짐
        Date date = new Date(); // new 연산자를 이용해서 메모리 할당
        System.out.println(date.getDate());
        date.setDate(1988, 11, 27);
        System.out.println(date.getDate());
    }
}