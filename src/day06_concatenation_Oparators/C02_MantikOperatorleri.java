package day06_concatenation_Oparators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {
        System.out.println(5+2==8);// esitlik bir tarafı 7 diger tarafı 8

        boolean sonuc1= 5>4 && 7<9 && 6+3==9 && 5+2!=8 ; // true  true true true  = sonuç true oldu
        System.out.println(sonuc1);

        boolean sonuc2= 5>4 && 7>9 && 6+3==9 && 5+2!=8; // true false tru true = sonuç false olur
                                                        // çunku &&(And-ve) mükemmelliyetçi
                                                        // tümü true olmalı

        System.out.println(sonuc2);

        boolean sonuc3= 5>4 & 7>9 & 6+3==9 & 5+2!=8; // false
        /* && ile & aradakı fark
         */
        int sayi3=15; // sayi 3 10 ile 20 nin arasında mı?
        System.out.println(10<sayi3 && sayi3<20); // true

        int sayi4=5; // sayi4 10 ile 20 arasında olmadığını true diyerek dondurelim

        // System.out.println(sayi3<10 && sayi3>20); // hem 10 dan kucuk hem 20 den buyuk olamaz
        System.out.println(sayi3<10 || sayi3>20); //true oldu hem 10 dan kucuk ve 20 den buyuk
    }
}
