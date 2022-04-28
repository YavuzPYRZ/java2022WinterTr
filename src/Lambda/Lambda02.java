package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda02 {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 2, 6, 11, -5, 7, 3, 15));
        ciftKarePrint(sayi);//16 4 36
        System.out.println("\n   ***   ");
        tekKupBirFazlaPrint(sayi);//1332 -124 344 28 3376
        System.out.println("\n   ***   ");
        ciftKarekokPrint( sayi);

    }

        // Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz

    public static void ciftKarePrint(List<Integer> sayi) {
        sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(t -> t * t).//map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.
                forEach(Lambda01::yazdir);


    }
    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi

    public static void tekKupBirFazlaPrint(List<Integer> sayi) {
        sayi.
                stream().//sayilar akısa  alındı
                filter(t -> t % 2 != 0).//tek elemnalr fitrelendi
                map(t -> (t * t * t) + 1).//tek elemanları küplerinin 1 fazlasına udate edildi
                forEach(Lambda01::yazdir);//print edildi

    }

    // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void ciftKarekokPrint(List<Integer> sayi) {
        sayi.
                stream().
                filter(Lambda01::ciftBul).
                map(Math::sqrt).//meth ref--> double deger return eder
                //forEach(Lambda01::yazdir)--> yazdir() method int.  çalıştığı için map den çıkan dataları çalıştırmaz
                        forEach(t->System.out.print(t+" "));
    }
    // Task : list'in en buyuk elemanini yazdiriniz



    // Task : List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.
    public static void minBul(List<Integer> sayi) {
        //1. yontem Method Reference --> Integer class
        Optional<Integer> minSayiInteger = sayi.stream().reduce(Integer::min);
        //2. yontem Method Reference --> Math class
        Optional<Integer> minSayiMath = sayi.stream().reduce(Math::min);
        //3. yontem Lambda Expression
        int minSayiLJambda = (sayi.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y));
        //4. yontem Method Reference --> Haluk class
        Optional<Integer> minSayiHaluk = sayi.stream().reduce(Lambda02::byHalukMin);
    }

    public static int byHalukMin(int a, int b) {//bu method kendisine verilen iki int degerin en kücügunu return eder
        return a < b ? a : b;
    }


// Task : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.


// Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
// Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.
}