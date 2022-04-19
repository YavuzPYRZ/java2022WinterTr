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




    }
}
