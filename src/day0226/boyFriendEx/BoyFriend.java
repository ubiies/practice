package day0226.boyFriendEx;

public class BoyFriend {
    private String name;
    private int age;
    
    // 생성자 Constructor
    public BoyFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return this.age + " , " + this.name;
    }

    public void hear(String message) {
        System.out.println(message);
    }


    public static void main(String[] args) {
        BoyFriend b = new BoyFriend("James", 22);
    }

}
