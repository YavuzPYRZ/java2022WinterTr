package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer,String> myMap(){ // herkes ulassın, statik olsun, Map'lerden oluşşun içi Int ve String olsun adı da myMap olsun

        Map<Integer,String> sinifListesi = new HashMap<>();
        sinifListesi.put(101,"Ali, Can, Dev, 1453");
        sinifListesi.put(102,"Veli, Yan, QA, 1990");
        sinifListesi.put(103,"Ali, Yan, C, 2000");
        sinifListesi.put(104,"Ayse, Kan, C, 2001");
        sinifListesi.put(105,"Fatma, Han, Java, 2002");
return sinifListesi;
    }
}
