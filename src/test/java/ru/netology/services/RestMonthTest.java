package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class RestMonthTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/RestMonthFinance.csv")
    void testCalculateRestMonth(int income, int expenses, int threshold) {
        RestMonth service = new RestMonth();
        int monthsOfRest = service.CalculateRestMonth(income, expenses, threshold);

        Assertions.assertEquals(3, monthsOfRest);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/RestMonthFinanceRich.csv")
    void testCalculateRestMonthRich(int income, int expenses, int threshold) {
        RestMonth service = new RestMonth();
        int monthsOfRest = service.CalculateRestMonth(income, expenses, threshold);

        Assertions.assertEquals(2, monthsOfRest);
    }
}