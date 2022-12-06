package ru.netology.javaarray.StatService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void shouldCalcMonthSalesSum() {
        StatsService service = new StatsService();
        {

            int[] sales = {17, 12, 7, 25, 14, 21, 9, 13, 10, 22, 17, 8};
            int expectedMonthSum = 175;
            int actualMonthSum = service.getMonthSum(sales);

            Assertions.assertEquals(expectedMonthSum, actualMonthSum);
        }
    }

    @Test
    void shouldCalcMinMonth() {
        StatsService service = new StatsService();
        {

            int[] sales = {17, 12, 7, 25, 14, 21, 9, 13, 10, 22, 17, 8};
            int expectedMinSales = 3;
            int actualMinSales = service.getMinSales(sales);

            Assertions.assertEquals(expectedMinSales, actualMinSales);
        }
    }

    @Test
    void shouldCalcMaxMonth() {
        StatsService service = new StatsService();
        {

            int[] sales = {17, 12, 7, 25, 14, 21, 9, 13, 10, 22, 17, 8};
            int expectedMaxSales = 4;
            int actualMaxSales = service.getMaxSales(sales);

            Assertions.assertEquals(expectedMaxSales, actualMaxSales);
        }
    }

    @Test
    void shouldCalcAverageMonth() {
        StatsService service = new StatsService();
        {

            int[] sales = {17, 12, 7, 25, 14, 21, 9, 13, 10, 22, 17, 8};
            double expectedAverageMonth = 14.59;
            double actualAvergeMonth = service.getAverageSales(sales);

            Assertions.assertEquals(expectedAverageMonth, actualAvergeMonth);
        }
    }

    @Test
    void shouldCalcBelowAverageSales() {
        StatsService service = new StatsService();
        {

            int[] sales = {17, 12, 7, 25, 14, 21, 9, 13, 10, 22, 17, 8};
            int expectedBelowAverageSales = 7;
            int actualBelowAverageSales = service.getBelowAvSales(sales);

            Assertions.assertEquals(expectedBelowAverageSales, actualBelowAverageSales);
        }
    }

    @Test
    void shouldCalcAboveAverageSales() {
        StatsService service = new StatsService();
        {

            int[] sales = {17, 12, 7, 25, 14, 21, 9, 13, 10, 22, 17, 8};
            double expectedAboveAverageSales = 5;
            double actualAboveAverageSales = service.getAboveAvSales(sales);

            Assertions.assertEquals(expectedAboveAverageSales, actualAboveAverageSales);
        }
    }
}

