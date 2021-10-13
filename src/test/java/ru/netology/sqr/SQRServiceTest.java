package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'number of square numbers, in range',200,300,3",
                        "'number of square numbers, less range',1,2,0",
                        "'number of square numbers, more range',100000,100010,0",
                        "'number of square numbers, invalid min boundary value',1,99,0",
                        "'number of square numbers, valid min boundary value',100,110,1",
                        "'number of square numbers, valid min+ boundary value',121,130,1",
                        "'number of square numbers, valid max- boundary value',9500,9604,1",
                        "'number of square numbers, valid max boundary value',9700,9801,1",
                        "'number of square numbers, invalid max boundary value',10001,10010,0"})

    void shouldSqrtInPeriod(String testName, int leftValue, int rightValue, int expected) {

        SQRService service = new SQRService();

        int actual = service.sqrtInPeriod(leftValue, rightValue);

        assertEquals(expected, actual);
    }
}