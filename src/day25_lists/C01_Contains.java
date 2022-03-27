package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {
        List<String> harflar=new ArrayList<>();

        harflar.add("D"); // [D]
        harflar.add("M"); // [D,M]
        harflar.add(1,"T"); // [D,T,M]
        harflar.add(0,"T"); // [T,]
        System.out.println(harflar); // [T, D, T, M]

        harflar.contains("T"); // True dondurur ama ekranda goremeyiz

        System.out.println(harflar.contains("T")); // yazdırırsak ekranda goruruz // true

        System.out.println(harflar.contains("F")); // false doner

        List<String> karakterler=new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");

        System.out.println(harflar.containsAll(karakterler)); // carakterler listesinin tamamı var mı yok mu
         // ona bakıyor  //   true doner      containsAll hepsini içeriyormu demek

        karakterler.add("F");
        System.out.println(harflar.contains(karakterler)); // karakterlere F ekledik sonra yapınca yok dedi



    }
}
