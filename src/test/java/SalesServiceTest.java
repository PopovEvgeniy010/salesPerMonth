import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public
class SalesServiceTest {
    @Test
    void shouldFindSumOfAllSales() {
        StatsService service1 = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expecteSumOfAllSales = 180;
        int actualSumOfAllSales = service1.GetSumOfAllSales(sales);
        Assertions.assertEquals(expecteSumOfAllSales, actualSumOfAllSales);
    }

    @Test
    public
    void shouldFindAverageSalesPerMonth() {
        StatsService service2 = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSales = 15;
        int actualAverageSales = service2.GetAverageSalesPerMonth(sales);
        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }


    @Test
    public
    void shouldFindBetwennEndsMin() {
        StatsService service3 = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service3.GetMaxMonth(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public
    void shouldFindBetwennEndsMax() {
        StatsService service4 = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service4.GetMinMonth(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public
    void shouldFindBelowAverageSales() {
        StatsService service5 = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowAverageSales = 5;
        int actualBelowAverageSales = service5.GetBelowAverageSales(sales);
        Assertions.assertEquals(expectedBelowAverageSales, actualBelowAverageSales);
    }

    @Test
    public
    void shouldFindAboveAverageSales() {
        StatsService service6 = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAverageSales = 5;
        int actualAboveAverageSales = service6.GetAboveAverageMonth(sales);
        Assertions.assertEquals(expectedAboveAverageSales, actualAboveAverageSales);
    }

}




