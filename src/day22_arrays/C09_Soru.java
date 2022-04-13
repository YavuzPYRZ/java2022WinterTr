package day22_arrays;

import java.util.Arrays;

public class C09_Soru {


    public static void main(String[] args) {
        int arr[] = {5,10,20,30,40,0};

        for (int i = 0; i < arr.length ; i++) {
            arr[i]+=i;//0 ilk dongu de i = 0   rakam 5  toplam 5  arr[0]
                    // ikinci dongü i = 1    rakam 10  ttoplam 11  arr[1]
                    // ucuncu dongu i =2     rakam 20 toplam  22   arr[2]
        }
        System.out.println(Arrays.toString(arr));
    }
}
