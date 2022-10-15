package ru.netology.sqr;

public class SQRService {
    public int CalcSqr(int x, int y) {
        for (int i = 10; i < 100; i++) {
            if (i * i >= x & i * i <= y) {
                System.out.println("Ответ: " + i);;
            }
        }
        System.out.println("end");
        return -1;
    }
}

