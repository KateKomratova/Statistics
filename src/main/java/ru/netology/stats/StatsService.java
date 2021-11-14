package ru.netology.stats;

public class StatsService {


    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int averageSales(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int monthMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }

    public int monthMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

    public int numberMonthBelowAvg(int[] sales) {
        int counterMonth = 0;
        int avg = averageSales(sales);
        for (int sale : sales) {
            if (sale < avg) {
                counterMonth += 1;
            }

        }
        return counterMonth;
    }

    public int numberMonthAboveAvg (int[] sales) {
        int counterMonth = 0;
        int avg = averageSales(sales);
        for (int sale : sales) {
            if (sale > avg) {
                counterMonth+=1;
            }
        }
        return counterMonth;
    }
}
