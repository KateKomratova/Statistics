package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(enterpriseSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldAverageSales() {
        StatsService service = new StatsService();

        int[] avgSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageSales(avgSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldMonthMaxSales() {
        StatsService service = new StatsService();

        int[] maxSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.monthMaxSales(maxSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldMonthMinSales() {
        StatsService service = new StatsService();

        int[] minSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.monthMinSales(minSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldnumberMonthBelowAvg() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.numberMonthBelowAvg(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldnumberMonthAboveAvg() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.numberMonthAboveAvg(sales);

        assertEquals(expected, actual);

    }
}