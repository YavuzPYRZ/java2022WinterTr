package day51_maps;

import day49_maps.MapOlustur;

import java.util.List;
import java.util.Map;

public class C02_IstenenElementleriListele {
    /*
    Soru 2 ) Verilen map'te istenen programlama dilini bilen kişileri list olarak donduren bir method yazınız.


    map ==>  {101=Ali, Can, java, 102=Veli, Yan, java,103=Ali, Yan, C}
    istenen dil =Java
    sonuç [Ali, Veli]
     */
    public static void main(String[] args) {
        Map<Integer,String> sinifMap =  MapOlustur.myMap();
String istenenDil ="Java";
        List<String> istenenDiliBilenlerListesi = istenenDiliBilenlerListesiOlustur(sinifMap,istenenDil);
    }

    public static List<String> istenenDiliBilenlerListesiOlustur(Map<Integer, String> sinifMap, String istenenDil) {

        return null;
    }
}
