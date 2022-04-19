package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        /*
        linkedList in iki tane parent Interface i vardır. linkedlist olustururken data turuolarak linkedlist secersek
        iki parentteki tum methodlar kullanılabilir.

        Lilst secersek : sadece list interface deki methodlar.
        deque veya Queue secersek Deque deki methodları kullanabiliriz.

         */
        LinkedList<Integer> ll1 = new LinkedList<>();

        ll1.add(10); // LinkedList den calıştırır ve ekler.


        // sadece list intrface den ozellikler kullanmak istersek.

        List<Integer> ll2 = new LinkedList<>(); // data turunu list secersek sadece list deki ozellikleri kullanırız.
ll2.add(10);
ll2.remove(0);

        // sadece Deque (dek) den gelen ozellikleri kullanmak istersek.

        Deque<Integer> ll3 = new LinkedList<>();

        ll3.addLast(20);
        ll3.addFirst(15);
        System.out.println(ll3); // [15, 20]

        ll3.addLast(40); //
        System.out.println(ll3); // [15, 20, 40]

    }
}
