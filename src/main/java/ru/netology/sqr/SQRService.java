package ru.netology.sqr;

public class SQRService {

    public int sqrtInPeriod(int leftValue, int rightValue) {

        int counter = 0;

        for (int i = 10; i < 100; i++) {
            if ((leftValue <= i * i) && (i * i <= rightValue)) {
                counter += 1;
            }
        }

        return counter;
    }
}
