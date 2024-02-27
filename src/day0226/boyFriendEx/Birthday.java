package day0226.boyFriendEx;

public class Birthday {
    public static void main(String[] args) {
        BoyFriends boys = new BoyFriends();
        boys.add(new BoyFriend("James", 22));
        boys.add(new BoyFriend("원빈", 24));
        boys.add(new BoyFriend("정우성", 28));

        // for(BoyFriend b:boys) {
            // 안됨 forEach문에 객체를 넣을 수 없음
        // }
        
        for(BoyFriend b:boys) {
            b.hear("10000원씩 내놔");
        }
    }
}
