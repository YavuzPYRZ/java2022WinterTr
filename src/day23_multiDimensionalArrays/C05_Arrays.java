package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        // verilen bir array e yeni bir element ekleyen bir mathod olusturun
        int arr[] = {3,5,7};
      //  arr[3]=8; // calısınca hata veririr Array e ekleme yapamayız sınırları aştın bro der


        // arr={1,3,5,6}; var olan bir array e aynı boyutta bile olsa direk yeni degerler atayamayız

        arr = new int[4]; // diger arr yi oldurdu bunu yerine koydu new dedik

        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0]

        int arrYeni[] = new  int[5];
        arr=arrYeni; // bu atamayı da kabul etti

        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]

        arrYeni[0]=2;
        arrYeni[3]=5;

        arr=arrYeni;

        System.out.println(Arrays.toString(arr));

    }
}
