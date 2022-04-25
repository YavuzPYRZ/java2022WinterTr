package day_51_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_KullanilanHarfSayisiniBulma {
    public static void main(String[] args) {
            /*
            Verilen bir String’deki harfleri ve
            harflerin kacar kez kullanildigini return eden bir method yaziniz
             */
        String input ="Helloooooooo";
        String harflerArr[] = input.split("");

        Map<String,Integer> kullanımSayilari =new HashMap<>();

        for (String each:harflerArr
             ) {
            if (kullanımSayilari.containsKey(each)){

                kullanımSayilari.put(each,kullanımSayilari.get(each) + 1 );

            }else{
                kullanımSayilari.put(each,1);
            }
        }

        System.out.println(kullanımSayilari); // {e=1, H=1, l=2, o=8}


    }
}
