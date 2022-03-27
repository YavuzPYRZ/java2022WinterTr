package day24_List;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Aykut");
        isimler.add("yusuf");
        isimler.add("ilker");
        isimler.add("oguzhan");

        System.out.println(isimler); // [Aykut, yusuf, ilker, oguzhan]

        isimler.set(1,"Seçkin");
        System.out.println(isimler); // [Aykut, Seçkin, ilker, oguzhan] yusuf gider seçkin gelir


        // daha onceden Listede var olanları da arsiv gibi tutmak istersek
        List <String> logListesi = new ArrayList<>();

        logListesi.add(isimler.set(2,"Cosmos")); // isimler listesine gitti 2. index i Cosmos yaotı (ilker gitti)
        // donerken ilkeri getirdi. işlemin sonucu olark gelen ilkeri log listesine (arşive) ekledim..

        System.out.println(isimler); // [Aykut, Seçkin, Cosmos, oguzhan]
        System.out.println(logListesi); // [ilker]




    }
}
