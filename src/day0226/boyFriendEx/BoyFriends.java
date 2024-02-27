package day0226.boyFriendEx;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

// 열거 가능한 군집 iterable
public class BoyFriends implements Iterable<BoyFriend> {
    private List<BoyFriend> list = new ArrayList<>();

    public void add(BoyFriend boy) {
        this.list.add(boy);
    }

    public void remove(int index) {
        this.list.remove(index);
    }

    @Override
    public Iterator<BoyFriend> iterator() {
        return this.list.iterator();
    }
}
