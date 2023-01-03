package ru.netology.stats;

public class StatsService {
    public int getSumOfAllSales(int[] sales) {
        int SumOfAllSales = 0;
        for (int i = 0; i < sales.length; i++) {
            SumOfAllSales += sales[i];
        }

        return SumOfAllSales;
    }

    public int getAverageSalesPerMonth(int[] sales) {
        int SumOfAllSales = 0;
        int AverageSalesPerMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            SumOfAllSales += sales[i];
            AverageSalesPerMonth = SumOfAllSales / sales.length;
        }
        return AverageSalesPerMonth;
    }

    public int getMaxMonth(int[] sales) {
        int MaxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaxMonth]) {
                MaxMonth = i;
            }
        }
        return MaxMonth + 1;
    }

    public int getMinMonth(int[] sales) {
        int MinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[MinMonth]) {
                MinMonth = i;
            }
        }
        return MinMonth + 1;
    }

    public int getBelowAverageSales(int[] sales) {
        int AverageSalesPerMonth = getAverageSalesPerMonth(sales);
        int MonthBelowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < AverageSalesPerMonth) {

                MonthBelowAverage = MonthBelowAverage + 1;
            }
        }
        return MonthBelowAverage;
    }


    public int getAboveAverageMonth(int[] sales) {
        int AverageSalesPerMonth = getAverageSalesPerMonth(sales);
        int MonthBelowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > AverageSalesPerMonth) {

                MonthBelowAverage = MonthBelowAverage + 1;
            }
        }
        return MonthBelowAverage;
    }

}