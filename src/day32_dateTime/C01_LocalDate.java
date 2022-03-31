package day32_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate trh = LocalDate.now(); // objenin olusturuldugu tarihi trh ye atar/assegn eder

        LocalDate baskaTrh= LocalDate.of(1988,06,9);
        // istedigimiz yil ay ve gun de-gerlerine gore bize obje olusturulur.
        System.out.println(trh); // 2022-03-31

        System.out.println(trh.getDayOfMonth()); // 31 objenin olusturuldugu ayın gununu gosterir.

        System.out.println(trh.getDayOfWeek()); // THURSDAY tarih perşembe gunu  olusturulmuş diyor.

        System.out.println(trh.getMonthValue()); // 3 (mart ayıymış )  kaçoncı ay oldugunu yazdırır.

        System.out.println(trh.getYear()); // 2022     yılı verir.



    }
}
