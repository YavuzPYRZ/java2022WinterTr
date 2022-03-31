package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

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

            // bir tarihten istediğimiz kadar ileri yad geri gidebiliriz.

        System.out.println(trh.minusWeeks(20)); //2021-11-11    20 hafta once tarih ne oluyor.

        System.out.println(trh.minusWeeks(5).minusDays(3)); //2022-02-21 5 hafta 3 gün one

        System.out.println(trh.plusMonths(9).plusDays(10)); //2023-01-10   9 ay 10 gün sonrasını buldu


        // tatih dile gore degişmez

        System.out.println(LocalDate.now().isLeapYear()); // false  Leap yil mi deye bakıyor subat 28 cekti false oldu

        // istedigimiz ulkenin o andaki tarihini elde etmek isterseniz
        LocalDate trhZone = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone); // 2022-04-01 japonya nisana girmiş.

        // is ile başlayan sonuçlar boolean sonuçlar dondurur.


        System.out.println(trh.isAfter(baskaTrh)); // true iki tarih i karşılaştır. eşit mi? aynı mi?







    }
}
