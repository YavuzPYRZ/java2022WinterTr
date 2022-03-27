package day21_Arrays;

import java.util.Arrays;

public class C04javaBasicQ02 {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */


        int arr [] = {1,2,3,4,5,6,7};
        double ortalama=0;
        double toplam =0;

        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i]; // tek tek i leri gez toplama ekle
            ortalama=toplam/arr.length;
        }
        System.out.println(" verilen Arrayleri ortalamsı :" + ortalama);
        // karşılaştırma ve dongü yapmamız lazım ortalamanın üzerini bulmak için
        System.out.println(" ortalamadan buyuk elemenlar :");
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > ortalama){ // ortalamdan buyuk olan elemanlar
                System.out.print(arr[i]+ ", ");
            }
        }
    }
}
