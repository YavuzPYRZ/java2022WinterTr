package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add("ergin");
        list.add(15);
        list.add(10.2);

        System.out.println(list); // [ergin, 15, 10.2]

        list.set(1, (Integer)(list.get(1)) + 10);

        /*
        Jav da collevtion uyuesi bir yapda data turu object secilirse, her dta turunden deger ekleyebiliriz.
        ancak bu durumda surekli casting problemleri ile karşılasırız.
         */

        Map<Integer,String> sinifListesi = new HashMap<>();
        // bir sınıfta ogerenci no, isim, soyisim,bransh olarak map olusturmak istiyoruz
        // key tek bir unique degerdir. ama value/deger birden fazla bilgininin birleşiminden olusabilir.
        // bu durumda daha sonra istedigiiz bilgilere ulasabilmek icin tum elementler için
        // value aynıı bicimde olusturulmalıdır.

        /*
        Veri sıralaması ve şekilsel acıdan da..
         */

       // Map<Integer,String> sinifListesi = new HashMap<>();

        System.out.println(sinifListesi); // {101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, Dev}

        System.out.println(sinifListesi.keySet()); // [101, 102, 103]
        System.out.println(sinifListesi.values()); // [Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C]


    }
}
