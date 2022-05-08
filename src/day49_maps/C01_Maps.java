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
        Java da collection uyuesi bir yapda data turu object secilirse, her data turunden deger ekleyebiliriz.
        ancak bu durumda surekli casting problemleri ile karşılasırız.
         */

        Map<Integer,String> sinifListesi = new HashMap<>();
        // bir sınıfta ogerenci no, isim, soyisim,bransh olarak map olusturmak istiyoruz
        // key tek bir unique degerdir. ama value/deger birden fazla bilgininin birleşiminden olusabilir.
        // bu durumda daha sonra istedigiiz bilgilere ulasabilmek icin tum elementler için
        // value aynı bicimde olusturulmalıdır.

        /*
        Veri sıralaması ve şekilsel acıdan da.. boşluklar falan gibi mesela
         */

       // Map<Integer,String> sinifListesi = new HashMap<>();
        sinifListesi.put(101,"Ali, Can, Dev");
        sinifListesi.put(102,"Veli, Yan, QA");
        sinifListesi.put(103,"Ali, Yan, C");

        System.out.println(sinifListesi); // {101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, Dev}

        System.out.println(sinifListesi.keySet()); // [101, 102, 103]
        System.out.println(sinifListesi.values()); // [Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C]


    }
}
