package day22_arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {
        // verilen bir arrayde en kucuk ve en buyuk degerleri yazdırın

        int arr[]= {3,5,6,1,9,0,45,25,4,9,0};

        // sort methodu olmadan yapalım
        int enKucukSayi =Integer.MAX_VALUE; // arr[0]
              int enBuyukSayi=Integer.MIN_VALUE;
              // arr[0]
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<enKucukSayi){
                enKucukSayi=arr[i];
            }

            if (arr[i]>enBuyukSayi){
                enBuyukSayi=arr[i];
            }
        }

        System.out.println("Array'deki en kucuk sayi ="+ enKucukSayi);
        System.out.println("Array'deki en buyuk sayi ="+ enBuyukSayi);

//      Sort ile yapalım
        Arrays.sort(arr);
        System.out.println("Array'deki en kucuk sayi ="+ arr[0]);
        System.out.println("Array'deki en buyuk sayi ="+ arr[arr.length-1]);
    }
}
