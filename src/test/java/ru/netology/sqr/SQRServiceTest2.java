package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest2 {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void test_2(int x, int y) {
        SQRService service = new SQRService();
        int actual = service.CalcSqr(x, y);
        System.out.println(actual);
    }
}
