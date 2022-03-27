package day23_multiDimensionalArrays;

public class C03_multiDimensionalArrays {
    public static void main(String[] args) {
        //boyutları bilirli bir array'i elementleri girmeden olsturalım
        // bir okulda icinde 24 ogrenci olan 8 sınıf vardır

        int arr [][] = new int[8][24];

        // bir ilçede  her birinde 24 ogrencilik 8 sınıf bulunan 5 okul vardır.

        int ilce [][][]=new int[5][8][24];

        // bir okulda 3 tane 24 kişilik 2 tane de 22 kisilik sınıf vardır
        int sinif24[][]= new int[3][24];
        int sinif22[][]= new int[2][22];  // goruldugu tek olusturamayız

        // olustururken elementleri atama yaparsak farklı uzunlukta inner array ler tanımlayabiliriz.


    }
}
