package day0227.Homework;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/*
포커게임 : 원페어 투페어까지만 구현 (객체를 이해하는것)
카드라는 클래스 (번호 무늬 색깔) 52개의 객체 
collections 셔플 메소드
포커카드 정렬 compare문
사용자의 수 입력 받아서 카드를 뿌리고 누가 이겼는지 판별
 */

enum Suit {
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

/**
 * Card와 관련된 클래스
 */
public class Card implements Comparable<Card> {
    private int number;
    private Suit shape;

    public Card(int number, Suit shape) {
        this.number = number;
        this.shape = shape;
    }

    public int getNumber() {
        return number;
    }

    public Suit getShape() {
        return shape;
    }

    @Override
    public int compareTo(Card card) {
        int numComparison = Integer.compare(this.number, card.number);
        if (numComparison != 0) {
            return numComparison;
        }
        return this.shape.compareTo(card.shape);
    }

    @Override
    public String toString() {
        return this.number + " of " + this.shape.getColor() + " " + this.shape;
    }
}

/**
 * Deck에 관련된 클래스
 */
class Deck {
    private List<Card> cards;

    // 52개 객체 생성
    public Deck() {
        cards = new ArrayList<>(52);
        for (Suit suit : Suit.values()) {
            for (int number = 1; number <= 13; number++) {
                cards.add(new Card(number, suit));
            }
        }
    }

    /*
     * 카드를 섞는 메서드
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /*
     * 카드 나눠주는 메서드
     */
    public List<List<Card>> dealCards(int players, int cardsPerPlayer) {
        shuffle();
        List<List<Card>> list = new ArrayList<>();

        for(int i=0;i<players;i++) {
            List<Card> playersCards = new ArrayList<>();
            for(int j=0;j<cardsPerPlayer;j++) {
                playersCards.add(cards.remove(cards.size()-1));
            }
            list.add(playersCards);
        }
        return list;
    }

    /*
     * 게임 구현 메서드 
     * 승자 판별 메서드 ...
     */

    @Override
    public String toString() {
        return this.cards.toString();
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇명이 게임에 참여합니까? ");
        int player = sc.nextInt();

        Deck gameDeck = new Deck();

        // 52개의 카드
        System.out.println(gameDeck.toString());

        // 카드 나눠주기
        gameDeck.dealCards(player, 52/player);



        /**
         * 게임 구현 메서드...
         */

        sc.close();
    }
}

// if (index >= size || index < 0) {
//     throw new IndexOutOfBoundsException("Invalid index: " + index);
// }