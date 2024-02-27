package day0227;

public class Member {
    int no; // private 타입이 아닐 경우 상속됨
    String name;

    // // new 뒤에 반드시 생성자가 와야함..
    // public Member() {

    // }

    public Member(int no, String name) {
        this.no = no;
        this.name = name;
    }
}
