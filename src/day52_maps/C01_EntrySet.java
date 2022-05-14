package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap =  MapOlustur.myMap();

      //  System.out.println(sinifListMap.entrySet()); // bu collection [101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C]
        System.out.println(sinifListMap); // bu map {101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C}
/*
myMap..entrySet(); method'u bize Entry'lerden oluşan bir set dondurur.
Eger bu entry'leri manipule etmek istiyorsak
mehthod'un dondurdugu Set'i yeni bir Set olsturup store etmeliyiz.
 */
        Set<Map.Entry<Integer,String>> sinifEntrySeti = sinifListMap.entrySet(); // map'i entry'lere cevirdik (entry = key+value)

        System.out.println("No   İsim   Soyisim   Brans  D.yılı");
        System.out.println("---------------------------------------");

        for (Map.Entry<Integer,String> each: sinifEntrySeti
             ) {
            Integer entryKey = each.getKey();
            String entryValue = each.getValue();

            String valueArr[] = entryValue.split(", ");

            System.out.printf( "%-4d %-6s %-9s %-6s %s\n" , entryKey , valueArr[0] , valueArr[1] ,valueArr[2] ,valueArr[3]);

        }
        System.out.println("--------------------------------------");
    }
}
