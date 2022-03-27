package day21_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        int arr[]; // deger ataması yapmadık ama java kabul etti
        // System.out.println(Arrays.toString(arr)); // kabul eder ama kullanmamıza izın vermez
        //  arr={1,2,3}; bunu da kabul etmedi cunki bu arrayi olustururken kaç degerlik olduğunu belirtmedi

        arr= new int[6];
        System.out.println(Arrays.toString(arr));// [0, 0, 0, 0, 0, 0]

        System.out.println(arr.length); // arrayin element sayısını verir  // 6
                                    // stringdeki leng methodunda () vardı , bunda yok

        // array deki her bir elemanı index degeri kadar arttıralım

        for (int i = 0; i < arr.length; i++) {
            arr[i] +=i;

        }
        System.out.println(Arrays.toString(arr));//   [0, 1, 2, 3, 4, 5]

        // son index deki elemenı yazdıralım

        System.out.println(arr [arr.length-1]); //   5

    }
}
