package com.ohgiraffers.section01.intro;

public interface OuterCalculator {
    @FunctionalInterface
    public interface Sum {


        int sumTwonumber(int a, int b);
    }

    @FunctionalInterface
    public interface Minus {
        int minusTwonumber(int a, int b);
    }

    @FunctionalInterface
    public interface Multiple {
        int multiplyTwonumber(int a, int b);
    }

    @FunctionalInterface
    public interface Divide {
        int divideTwonumber(int a, int b);
    }
}
