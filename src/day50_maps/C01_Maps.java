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


        // şimdi bu listeyi multi damentionel Array a atmak istiyorum
        //hebir value birden fazla bilgi içiriyor. onun için valueleri
        // mDA a atmak mantılı amcak MDA için boyutları bilmemiz gerekiyor.

        int outerArrayBoyut = sinifValueList.size();
        System.out.println(outerArrayBoyut); // 3
// inner arrayların boyutunu bulmak biraz daha komlex olacak.

        String ilkValue = sinifValueList.get(0);
        System.out.println(ilkValue); // Ali, Can, Dev
        String ilkValueArray[] = ilkValue.split(", ");
        int innerArrayBoyut = ilkValueArray.length;
        System.out.println(innerArrayBoyut);  //  3

        String valueMDArr[][] = new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[] = sinifValueList.get(i).split(", ");

            for (int j = 0; j <innerArrayBoyut ; j++) {
           valueMDArr[i][j] = temp[j];
            }


        }
        //  System.out.println(Arrays.deepToString(valueMDArr));


// bu satıra kadar key leri index ile ulasabildigim keyList e atadık
     //   value leri MDA olan valueMDArr a atadım.
        // simdi bu key ve valueleri istediğim gibi manipule edebilirim.

        System.out.println("Numara  Isim   Soyisim  Brans");
        System.out.println("=============================");

        for (int i = 0; i <keyList.size() ; i++) {
            System.out.print(keyList.get(i) + "   ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
                System.out.print(valueMDArr[i][j]+ "   ");

            }
            System.out.println("");
        }

    }

}
