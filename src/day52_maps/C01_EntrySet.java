package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;

public class C01_EntrySet {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap =  MapOlustur.myMap();

        System.out.println(sinifListMap.entrySet()); // [101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C]
        System.out.println(sinifListMap); // {101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C}

    }
}
