package day26_forEachLoop_constructur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        // on elementli bir list olusturalım

        int arr [] ={2, 5, 4, 6, 4, 9, 7, 1, 3, 10};
        System.out.println(Arrays.toString(arr));

        List<Integer> sayilar = new ArrayList<>();

        for (int each :arr
             ) {
            sayilar.add(each);
        }
        System.out.println(sayilar);


        // sayilar listesinde 3 e bolunemeyen sayiları for each ile yazdıralım

        for (int each :sayilar
             ) {
            if (each%3 !=0 ){
                System.out.print(each+ " ");
            }
        }

    }
}
