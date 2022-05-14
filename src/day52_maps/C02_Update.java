package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C02_Update {
    // verilen map'daki numarası 102 olan kaydın bransını Java yapalım
    /*
Map'da value komplex olabildigi için value içerisinden bir bolumu degiştimek istersek
once value'ya ulaşmak sonra da onu manipule ederek istedişimiz deşişikligi yapmak
en degişmiş halini yeniden Map'a ekmek gerekir.
     */
    public static void main(String[] args) {
        Map<Integer,String> sinifListesiMap = MapOlustur.myMap();

        System.out.println(sinifListesiMap);



        Set<Map.Entry<Integer,String>> sinifListesiSet = sinifListesiMap.entrySet();

        for (Map.Entry<Integer,String> each:sinifListesiSet
             ) {
            Integer keyEntry = each.getKey();

            if (keyEntry==102){
                String valueEntry = each.getValue();
                String valueArr[] = valueEntry.split(", ");
                valueArr[2] = "Java";

                String valueYeni = valueArr[0] + ", " + valueArr[1] + ", " + valueArr[2] + ", " + valueArr[2];
                sinifListesiMap.put(keyEntry, valueYeni);

            }
        }

        System.out.println(sinifListesiMap);
    }
}
