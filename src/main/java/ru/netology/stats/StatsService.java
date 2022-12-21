package ru.netology.stats;

public
class StatsService {
    public
    int GetSumOfAllSales(int[] sales) {
        int SumOfAllSales = 0;
        for (int i = 0; i < sales.length; i++) {
            SumOfAllSales += sales[i];
        }

        return SumOfAllSales;
    }

    public
    int GetAverageSalesPerMonth(int[] sales) {
        int SumOfAllSales = 0;
        int AverageSalesPerMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            SumOfAllSales += sales[i];
            AverageSalesPerMonth = SumOfAllSales / sales.length;
        }
        return AverageSalesPerMonth;
    }

    public
    int GetMaxMonth(int[] sales) {
        int MaxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaxMonth]) {
                MaxMonth = i;
            }
        }
        return MaxMonth + 1;
    }

    public
    int GetMinMonth(int[] sales) {
        int MinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[MinMonth]) {
                MinMonth = i;
            }
        }
        return MinMonth + 1;
    }

    public
    int GetBelowAverageSales(int[] sales) {
        int AverageSalesPerMonth = GetAverageSalesPerMonth(sales);
        int MonthBelowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < AverageSalesPerMonth) {

                MonthBelowAverage = MonthBelowAverage + 1;
            }
        }
        return MonthBelowAverage;
    }


    public
    int GetAboveAverageMonth(int[] sales) {
        int AverageSalesPerMonth = GetAverageSalesPerMonth(sales);
        int MonthBelowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > AverageSalesPerMonth) {

                MonthBelowAverage = MonthBelowAverage + 1;
            }
        }
        return MonthBelowAverage;
    }

}