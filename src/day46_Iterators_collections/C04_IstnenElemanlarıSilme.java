package day46_Iterators_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_IstnenElemanlarıSilme {
    public static void main(String[] args) {
        /*
        bir listedeki istenen sayı arlıgında (20 ve 40 -dahil-) OLMAYAN elemanları silen bir program yazınız.

         */

        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        ListIterator itr = liste.listIterator();

        while (itr.hasNext()){ // itr bir sonrakinde eleman oldugu surece calısacak
            Object sayi = itr.next(); // bir saga atladığı sayıyı alacabilecegimiz bir sayi adında bir veriable olştut
                                    //  iterator next i bir kere kullanmalıydık(her kullanmada bir saga gider)
                                    //  o yüzden ifin icinde olmaz.
                                    // int yapmadık cunkü


            if ((Integer)sayi<=20 || (Integer)sayi>=40){ // obje sayısıyla işlem yaomayız bu nedenle  CAST yaptık(Integer) yazdık
                itr.remove();
            }
        }

        System.out.println(liste); // [23]

    }
}
