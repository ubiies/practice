package day0227;

/*
 * 생성자는 private
 * enum 타입은 고정된 상수의 집합으로, 컴파일시에 타입 안정성이 보장되어야 함
 */
public enum Suit {
    Spade("Black"),
    Diamond("Red"),
    Heart("Red"),
    Club("Black");

    private String color;

    private Suit() {}
    private Suit(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
}

class Card {
    private int number;
    private String displayNumber;
    private Suit shape;
    private String color;

    public Card(int number, Suit shape) {
        this.number = number;
        this.shape = shape;
        this.displayNumber = getDisplayNumber(number);
    }

    private String getDisplayNumber(int number) {
        return null;
    }

    public String getColor() {
        return this.shape.getColor();
    }

}

class Board {
    public static void main(String[] args) {
        Card card = new Card(1, Suit.Spade);
        System.out.println(card.getColor());
    }
}
