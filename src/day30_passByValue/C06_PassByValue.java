package day30_passByValue;

import java.util.Arrays;

public class C06_PassByValue {
    public static void main(String[] args) {
        // non primitive data turlerinde onjenin kendizi degilde içindeki elementler değişirese
        // Java objenin referansı ve on-bjenin kendisi degişmedigi için elelment degişikliklerini kabul eder
        // ve kalıcı yapar
        int arr[] = {1,2,3};
        System.out.println(Arrays.toString(arr)); // [1, 2, 3]
        arrDegistir(arr);
        System.out.println("method call sonrası" + Arrays.toString(arr)); // method call sonrası[5, 6, 3]
    }

    static void arrDegistir(int[] arr) {
        arr[0]=5;
        arr[1]=6;
        System.out.println(Arrays.toString(arr)); // [5, 6, 3]
    }
}
