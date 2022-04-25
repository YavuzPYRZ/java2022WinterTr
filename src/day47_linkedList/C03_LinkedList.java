package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {

        Deque<Integer> ll1 = new LinkedList<>();

       // System.out.println(ll1.element()); boş ken kullanırsa exception fırlatıyor.

        System.out.println(ll1.peek()); // boş ikin kullanırsak null donduruyor.

        System.out.println(ll1.poll()); // null dondurdu.
        System.out.println(ll1.pollFirst());
        System.out.println(ll1.pollLast());

     //  ll1.pop(); // en baştaki elemanı siler ve bize dondurur. yoksa exception fırlatır.


        ll1.push(30);
        ll1.push(20);
        System.out.println(ll1); // [20, 30] listenin basına eleman ekler.

        ll1.push(40);

        ll1.remove(); // ilk elemanı siler. istersek onu bize dondurur.
        ll1.remove(30); // 30 u arar bulur onu siler.

        ll1.push(80);
        ll1.push(30);
        ll1.push(70);
        ll1.push(30);
        System.out.println(ll1); //[30, 70, 30, 80, 20]

        ll1.removeLastOccurrence(30); // en son kullanılan 30 u bulur ve siler.
        System.out.println(ll1); //[30, 70, 80, 20]





    }
}
