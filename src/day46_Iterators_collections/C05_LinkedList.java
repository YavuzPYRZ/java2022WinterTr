package day46_Iterators_collections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(10); // add methodu List den geldigi için hep sona ekler.
        list.addFirst(11); // deque den gelir bu method . bu da sona ekler.
        list.addLast(12); // bu da Deque den gelir başa ekler.

        System.out.println(list); //[11, 5, 10, 12]

        list.add(2,25); // 2. index e 25 ekle...
        System.out.println(list); // [11, 5, 25, 10, 12]



    }
}
