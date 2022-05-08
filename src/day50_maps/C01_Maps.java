package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {

    public static void main(String[] args) {
        /*
        sınıftaki ogrenci listesiniz duzenlli olarak yazdıralım.

         */

        Map<Integer, String> sinifListMap = MapOlustur.myMap();// sag tarafta day49 dan Map olustur'u getirip sol tarafa atadık
        System.out.println(sinifListMap); //{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C}  day 49 den sınıf listesini çekti

        Set<Integer> sinifKeySeti = sinifListMap.keySet();
       // Integer keyArr[]= new Integer[sinifKeySeti.size()]; // Setten elemanları alıp atacagımız bir Array oluşturuyoruz
        // index i sayan bir veriable oluşturmak gerekecek. bu nedenle biz array degil list ile yapacagız.
        List<Integer> keyList = new ArrayList<>(); // list oluşturuduk
       /* for (Integer each: sinifKeySeti // setteki butun key leri liste atmak isyiyorum.
             ) {
            keyList.add(each);
        } */

        keyList.addAll(sinifKeySeti);
        /*
    eger key lere tek tek ulasmak istersek
    index yapısına ihtiyaç var ama map index yapısını desteklemez
    bunun içiin key leri once bir set'e  sonra da set'in tum elemanlarını bir list'e ekledik.
     */
     //   System.out.println(keyList.get(2)); // 103
        // Simdi de value leri index ile ulasabilecegimiz bir  şekle sokalım

        Collection<String> sinifValueCollection = sinifListMap.values();
        System.out.println(sinifValueCollection); // {101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C}
        System.out.println(sinifValueCollection.size()); // 3


        List<String> sinifValueList = new ArrayList<>(); // listemizi Arraylerden oluşan bir liste çevirdik.
        sinifValueList.addAll(sinifValueCollection);
        System.out.println(sinifValueList);// [Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C]



    }

}
