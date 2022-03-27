package day25_lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {
        // verilen bir array den istenen elementi silip (kaç taneyse) 
        // kalanları yeni bir array olarak yazdıran bir method oluşturun

        int arr[] = {3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenElaman = 3;


        istenmeyenElementiSil(arr,istenmeyenElaman);
    }

    public static void istenmeyenElementiSil(int[] arr, int istenmeyenElaman) {

        // 1 adım istenmeyen element sayısını bul
        int sayac =0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==istenmeyenElaman) {
                sayac++;
                
            }
        }
        
        //2. adım yeni array oluştur
        int arrYeni [] = new int[arr.length-sayac];
                
        // 3, adım eski arayden uygun elementleri yeniye taşı
        int index = 0;

        for (int i = 0; i <arr.length; i++) {
            if (arr[i]!= istenmeyenElaman){
             arrYeni[index]   = arr[i];
             index++;
            }
        }
        
        //4. Adım yeni Array'i yazdır.

        System.out.println(Arrays.toString(arrYeni));

        
    }
}
