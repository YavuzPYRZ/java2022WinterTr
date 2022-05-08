package day49_maps;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public class C02_ListeyiDuzenliYazdirma {
    public static void main(String[] args) {
        // Sinif listesini duzenli bir sekilde yazdirmak
        Map<Integer,String> sinif=  MapOlustur.myMap(); //sag taraf  bana getiriyor    sol tarafta atama yapıyoruz
        System.out.println(sinif); //{101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C}


        sinifListYazdir(sinif); // bir method oluşturalım.
    }
    public static void sinifListYazdir(Map<Integer, String> sinif) { // public yaptık ki başka classlardan da kullanabiliyoruz.
        System.out.println("Numara  Isim   Soyisim  Brans");
        System.out.println("=============================");
        // Map yapisinda yazdirdigimizda kullanicilar bir sey anlamayabilir
        // bunun icin once map yapisini kodlarla manipule edip
        // map'deki datalari, istedigimiz formata sokmamiz gerekir
        // 1. adim key ve value'lari map'den alip
        // iki farkli collection uyesine atadik
        Set<Integer> keySet=sinif.keySet(); // sinif.keySet() ile key'ler bana gelsin,
                                            // ama içinde işlem yapabilmek için set'e atayalım,
                                             // int lerden oluşsun. adı da keySet olsun

        Collection<String> valueSet=sinif.values(); // yukarıda keyleri getirmiştik şimdi de key leri getirelim.

                                // yukarıdaki 2 işlem acıklamada yazan 1. adım.(iki farklı collection uyesine atadık)

        System.out.println(keySet); // [101, 102, 103]
        System.out.println(valueSet); // [Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C]
        System.out.println(valueSet.size());   // 3 value nin boyutu 9 degil 3 tür dikkaaaat
        for (String each: valueSet
        ) {
            System.out.println(each); //Ali, Can, Dev
                                      //  Veli, Yan, QA
                                    // Ali, Yan, C
        }
    }
}