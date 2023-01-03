package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service1 = new StatsService();
        System.out.println(service1.getSumOfAllSales(arr));

        StatsService service2 = new StatsService();
        System.out.println(service2.getAverageSalesPerMonth(arr));

        StatsService service3 = new StatsService();
        System.out.println(service3.getMaxMonth(arr));

        StatsService service4 = new StatsService();
        System.out.println(service4.getMinMonth(arr));

        StatsService service5 = new StatsService();
        System.out.println(service5.getBelowAverageSales(arr));

        StatsService service6 = new StatsService();
        System.out.println(service6.getAboveAverageMonth(arr));

    }
}