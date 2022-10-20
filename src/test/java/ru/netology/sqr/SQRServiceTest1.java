package ru.netology.sqr;

import org.junit.jupiter.api.Test;

public class SQRServiceTest1 {

    @Test
    public void test() {
        SQRService service = new SQRService();
        System.out.println(service.CalcSqr(200, 300));
    }
}

