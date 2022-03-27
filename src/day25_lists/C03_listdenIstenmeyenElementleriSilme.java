package day25_lists;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public class C03_listdenIstenmeyenElementleriSilme {
    public static void main(String[] args) {
        // verilen bir array den istenen elementi silip (kaç taneyse)
        // kalanları yeni bir array olarak yazdıran bir method oluşturun

        int arr[] = {3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenElaman = 3;


        istenmeyenElementiSilveYazdir(arr,istenmeyenElaman);
    }



    public static void istenmeyenElementiSilveYazdir(int[] arr, int istenmeyenElaman) {
        List<Integer> yeniList =new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != istenmeyenElaman){
                yeniList.add(arr[i]);
            }
        }
        System.out.println(yeniList); // [4, 2, 5, 7, 8, 5, 2, 4]
    }
}
