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
        return this.number + " of " + this.shape;
    }
}

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

    public void shuffle() {
        Collections.shuffle(cards);
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
        System.out.println("몇명이 게임에 참여합니끼? ");
        int player = sc.nextInt();

        Deck gameDeck = new Deck();
        gameDeck.shuffle();
        System.out.println(gameDeck.toString());

        /**
         * 게임 구현 메서드...
         */

        sc.close();
    }
}