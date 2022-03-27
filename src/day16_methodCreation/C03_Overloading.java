package day16_methodCreation;

import static day15methodCreation.C06_MethodCreation.ikiSayiTopla;

public class C03_Overloading {
    public static void main(String[] args) {
        // verilen iki sayıyı toplayan ve yazdıran bir method olusturalım

        int sayi1 = 10;
        int sayi2 = 20;


        ikiSayiyiTopla(sayi1,sayi2);

        // iki double sayının toplamı

        double sayi3=10;
        double sayi4=65;
        ikiSayiTopla(sayi3,sayi4); // iki tane aynı adda method yaptı ama biri int, digeri double

        // eger verianle oluşturmadan direk sayiları yazarsak method call yaparsam

        ikiSayiTopla(15,45.9);



    }

    private static void ikiSayiTopla(double sayi3, double sayi4) {
        System.out.println("iki dooble toplamı :"+(sayi3+sayi4));

    }

    private static void ikiSayiyiTopla(int sayi1, int sayi2) {
        System.out.println("iki intreger toplamı :"+(sayi1+sayi2));
    }
}
