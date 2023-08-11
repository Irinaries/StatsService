package ru.netology.StatsService.services;

public class StatsService {
    public long sumSales(long[] sales) {
        long sumMonth = 0;
        for (long sale : sales) {
            sumMonth += sale;

        }
        return sumMonth;
    }

    public long average(long[] sales) {
        return sumSales(sales) / sales.length;
    }


    public int monthMaximum(long[] sales) {
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSale]) {
                monthMaxSale = i;
            }
        }
        return monthMaxSale + 1;
    }

    public int monthMinimum(long[] sales) {
        int monthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSale]) {
                monthMinSale = i;
            }
        }
        return monthMinSale + 1;
    }


    public int monthsBellowAverage(long[] sales) {
        int salesBelowAverage = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                salesBelowAverage++;
            }
        }
        return salesBelowAverage;
    }


    public int monthsAboveAverage(long[] sales) {
        int salesAboveAverage = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                salesAboveAverage++;
            }
        }
        return salesAboveAverage;
    }

}
