package day09_ternary_Switch;

import java.util.Scanner;

public class C05_Tekrar1 {
    public static void main(String[] args) {
       /* // sayınn tek mi çift mı olduğunu bulalım

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz");
        int sayi= scan.nextInt();

        System.out.println(sayi%2==0?"Sayi Cifttir.":"Sayı Tekdir");
        */

        //verilen syının 3  olup olmadığını kontrol eden
        // ve sonucu yazdıran bir ternary olusturun

        int sayi1=999;

        String sonuc= (sayi1>99 && sayi1<1000) ? "sayi 3 Basamaklı": "Sayi 3 basamaklı degul";

        System.out.println(sonuc);


    }
}
