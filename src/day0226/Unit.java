package day0226;

public class Unit {
    int hp;
    String name;

    public int getHp() {
        return hp;
    }
    public String getName() {
        return name;
    }
}

class Zealot extends Unit {
    public void attack() {
        System.out.println("공격");
    }
}

class Marine extends Unit {

}

class Test {
    public static void main(String[] args) {
        Unit unit = new Unit(); // super class
        Zealot zealot = new Zealot(); // sub class
        Marine marine = new Marine();

        unit = zealot; // 무조건 성공(명시적 변환)
        zealot = (Zealot)unit; // 실페(암시적 변환)
        // zealot = (Zealot)marine; // 실패(같은 계층에서는 형 변환x)

        Unit u = new Zealot(); // unit type
        Zealot z = (Zealot)u; // zealot type
        z.attack();
        // Zealot z2 = (Marine)u; // error 명시적인 type casting 안됨
    }
}

class Test2 {
    public static void main(String[] args) {
        Object[] objects = {new int[] {1,2}, new Zealot(), "abc"}; // 모든 type으로 형 변환 가능
        for (Object o:objects) {
            if(o instanceof Zealot)
                ((Zealot)o).attack(); 
        }
    }
}