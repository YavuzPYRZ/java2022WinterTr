package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        // verilen bir array e yeni bir element ekleyen bir mathod olusturun
        int arr[] = {3,5,7};
        int eklenecekElement=4;
        arr = arrayeElemenEkle(arr,eklenecekElement); // yeni olusturacak array im eskisinin yerine gececek

        System.out.println(Arrays.toString(arr)); // [3, 5, 7, 4] eklemiş oldu

    }

    public static int[] arrayeElemenEkle(int[] arr, int eklenecekElement) {

        int yeniArray[] =new int[arr.length+1]; // [0,0,0,0]

        for (int i = 0; i <arr.length ; i++) {
        yeniArray[i]=arr[i];
        }
        yeniArray[yeniArray.length-1]=eklenecekElement;


        return yeniArray;


    }
}
