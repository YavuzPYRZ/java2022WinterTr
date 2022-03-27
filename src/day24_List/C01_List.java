package day24_List;

import day23_multiDimensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {

        int arr []={};

        // bu array'e 5 ekleyelim
      //  C06_Arrays obj=new C06_Arrays();
        arr = C06_Arrays.arrayeElemenEkle(arr,5); // var olan (içi boş du) array e 5 i ekledim

        System.out.println(Arrays.toString(arr)); // [5]

        // bir de 3 ekleyelim
        arr = C06_Arrays.arrayeElemenEkle(arr,3);
        System.out.println(Arrays.toString(arr)); // [5, 3]

        // bir list olusturalım

        List<Integer> sayilarList = new ArrayList<>();

        System.out.println(sayilarList); // []

        sayilarList.add(5); // [5]
        sayilarList.add(3); // [5,3]
        sayilarList.add(0,7); // [7,5,3]
        sayilarList.add(2,7);// [7,5,7,3]

        System.out.println(sayilarList);


    }
}
