package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {

        // list den gelen ozellikleri biliyoruz.
        // onun icin Degue den gelen ozelliklere bakalım.

        Deque<Integer> ll1= new LinkedList<>(); // new den sonra Deque denmez..

        ll1.addFirst(10); // basa element ekler. add methoduna gore daha hızlıdır.
        ll1.addLast(20); // sona eleman ekler.

        System.out.println(ll1); // [10, 20]
        System.out.println(ll1.element());// baştakı elemanı bize getirir AMA silmiyor. // 10
        System.out.println(ll1);// [10, 20] aynı kaldı silmedi.

        System.out.println(ll1.getLast()); //20 sondaki elemanı getirir.

        System.out.println(ll1.getFirst());// 10  bastakı elemanı getirir.

        ll1.offer(30); // 30 u sona ekledi. ama bize birşey dondurmez

        ll1.offerLast(40); // 40 ı da sona ekledi. ve bize true dondurur.
        System.out.println(ll1);  // [10, 20, 30, 40]

        System.out.println(ll1.peek()); //baştakı elemeti bize geririr bulamazsa null dondurur. // 10



    }
}
