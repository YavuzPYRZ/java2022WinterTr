package day50_maps;

import day49_maps.MapOlustur;

import java.util.Map;

public class C01_Maps {

    public static void main(String[] args) {
        /*
        sınıftaki ogrenci listesiniz duzenlli olarak yazdıralım.

         */

        Map<Integer, String> sinifList = MapOlustur.myMap();// sag tarafta day49 dan Map olustur'u getirip sol tarafa atadık
        System.out.println(sinifList); //


    }
}
