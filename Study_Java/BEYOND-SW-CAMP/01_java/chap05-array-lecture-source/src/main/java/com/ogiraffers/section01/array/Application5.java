package com.ogiraffers.section01.array;

import java.util.Random;

public class Application5 {

    public static void main(String[] args) {

        /* 수업목표. 베열을 사용하는 예시를 통해 카드 게임을 작성해보자. */
        String[] shape = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int randomShapeIndex = (int) (Math.random() * 4);           // 0 ~ 3
        int randomCardNumberIndex = new Random().nextInt(13);      // 0 ~ 12

        System.out.println("당신이 뽑는 카드는 \"" + shape[randomShapeIndex] + " "+
                cardNumbers[randomCardNumberIndex] + "\" 카드 입니다.");
    }
}
