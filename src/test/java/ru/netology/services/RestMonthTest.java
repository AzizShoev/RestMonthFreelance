package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RestMonthTest {

    @ParameterizedTest
    @CsvSource({
            "10000,3000,20000"
    })
    void testCalculateRestMonth(int income, int expenses, int threshold) {
        RestMonth service = new RestMonth();
        int monthsOfRest = service.CalculateRestMonth(income, expenses, threshold);

        Assertions.assertEquals(3, monthsOfRest);
    }

    @ParameterizedTest
    @CsvSource({
            "100000,60000,150000"
    })
    void testCalculateRestMonthRich(int income, int expenses, int threshold) {
        RestMonth service = new RestMonth();
        int monthsOfRest = service.CalculateRestMonth(income, expenses, threshold);

        Assertions.assertEquals(2, monthsOfRest);
    }
}