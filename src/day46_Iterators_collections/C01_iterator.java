package day46_Iterators_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_iterator {
    public static void main(String[] args) {

        List<Integer> liste= new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);

        Iterator itr = liste.iterator();// iterator methodunu olusturdugumuz liste objesi zetinden
                                        // Array list clasından calıştırıyoruz

        /*
        iterator nasıl calışır.
        bir iterator objesi oluşturmak için collection uyesi bir obje kullanmalıyız.
        yani biz bu iterator objesini bizim ornegimizde liste objesi uzerinde çalışmak için olusturmuş olsuk
        biz iterator objesiniz olusturdugumuzda iterator collection ın ilk elementine gider bekler.
        [(itr)5, 7, 8, 6, 9]
     itr.hasNext() yanında elemen var mı dedik o da var dedi. turu yada false dondurur.
     itr.next()  bir sonraki elemanın yanına geçer ve uzerinden geçtigi elementi bize dondurur.
     itr.remove();  iterator un elinde olan elemanı sildi.

         */
        System.out.println(itr.hasNext());// true // has sahip olmak next yanında  ... yanında birşey var mı demek.
        System.out.println(itr.next()); // 5
        System.out.println(itr.next()); // 7
        itr.remove();
       // itr.remove(); en son ellinde 7 vardı onu da sildirdik.
                        // ama elinde eleman yokken biz elindkini sildir deyince excepton fırlatır.
        // once itr.next(); methodu calıştırıp eline bir eleman almasını saglamalıyız.
        System.out.println(liste);
    }
}
