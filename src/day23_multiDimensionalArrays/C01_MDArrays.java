package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {
        int arr [][] = {{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]); //7
        System.out.println(arr[1][1]); //10

       // ilk inner arryin tüm elenetlerini yazdırın

        System.out.println(arr[0]); // [I@5b464ce8   referansını verir
        System.out.println(Arrays.toString(arr[0])); // [3, 1, 7]
        System.out.println(Arrays.toString(arr)); // [[I@5b464ce8, [I@57829d67]

        //MDArray de tüm elementleri bir array olarak yazdırmak istersek
        System.out.println(Arrays.deepToString(arr)); // [[3, 1, 7], [6, 10, 2]]
    }
}
