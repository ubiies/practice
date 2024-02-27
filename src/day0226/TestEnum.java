package day0226;

import day0226.TestEnum.Suit;

public class TestEnum {
    enum Suit {
        Spade,
        Diamond,
        Heart,
        Club
    }
    public static void main(String[] args) {
        Suit suit = Suit.Spade;
    }
}
class PlayingCard {
    Suit suit;
    public int number;
}

// class Test {
//     public static void main(String[] args) {
//         PlayingCard card = new PlayingCard();
//         card.suit = Suit.Spade;
//         card.number = 1;
//         System.out.println(card.suit+" "+card.number);

//         Suit suit1 = Suit.Spade;
//         Suit suit2 = Suit.Spade;
        

//     }
// }
