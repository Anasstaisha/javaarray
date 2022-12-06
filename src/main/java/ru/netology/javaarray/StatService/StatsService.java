package ru.netology.javaarray.StatService;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StatsService {

    public int getMonthSum(int[] sales) {
        int monthSum = 0;
        for (int sale : sales) {
            monthSum += sale;
        }
        return monthSum;
    }

    public int getMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public double getAverageSales(int[] sales) {
        double salesSum = getMonthSum(sales);
        double averageMonth = salesSum / sales.length;

        double d = averageMonth;
        d = new BigDecimal(d).setScale(2, RoundingMode.UP).doubleValue();
        return d;
    }

    public int getBelowAvSales(int[] sales) {
        double salesAverage = getAverageSales(sales);
        int result = 0;
        for (int sale : sales) {
            if (sale < salesAverage) {
                result++;
            }
        }
        return result;
    }

    public double getAboveAvSales(int[] sales) {
        double salesAverage = getAverageSales(sales);
        int result = 0;
        for (int sale : sales) {
            if (sale > salesAverage) {
                result++;
            }
        }
        return result;
    }
}
