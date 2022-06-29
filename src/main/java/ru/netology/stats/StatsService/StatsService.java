package ru.netology.stats.StatsService;

public class StatsService {

    public long totalSales(long[] sales) {
        // Определяем общие продажи за период
        long totalSales = 0;
        // Инициируем переменную для общих продаж
        for (long sale : sales) {
            // Пробегаем весь массив данных и суммируем продажи по месяцам
            // sale - продажи в рассматриваемом месяце
            totalSales = totalSales + sale;
        }
        return totalSales;
    }


    public int minSales(long[] sales) {
        //  Ищем минимальные продажи
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long avgSales(long[] sales) {
        int monthNum = sales.length;
        // Выисляем количество ячеек в массиве (соответствует количеству месяцев)
        long avgSales = totalSales(sales) / monthNum;
        // Определяем седние продажи в месяц как среднее арифметическое
        return avgSales;
    }

    public int monthsBelowAvg(long[] sales) {
        int monthsBelowAvg = 0; // переменная для количества месяцев с продажами ниже среднего
        for (long sale : sales) {
            if (sale <= avgSales (sales)){
                monthsBelowAvg = monthsBelowAvg + 1;
            }
        }
        return monthsBelowAvg;
    }


    public int monthsAboveAvg(long[] sales) {
        int monthsAboveAvg = 0; // переменная для количества месяцев с продажами выше среднего
        for (long sale : sales) {
            if (sale > avgSales (sales) ){
                monthsAboveAvg = monthsAboveAvg + 1;
            }
        }
        return monthsAboveAvg;
    }
}