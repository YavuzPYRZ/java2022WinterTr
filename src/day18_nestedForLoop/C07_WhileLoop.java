package day18_nestedForLoop;

import java.util.Scanner;

public class  C07_WhileLoop {
    public static void main(String[] args) {
        // kullanıcıdn kac sayı toplamak istedigini al
        // bu sayıları alın ve bu sayıların toplamını ekrana yazdırın

        int sayiAdedi=3;
        Scanner scan = new Scanner(System.in);
        int sayi =0;
        int toplam =0;


        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("girilen "+sayiAdedi + " sayinin toplamı : "+ toplam);

        // while ile yapalim

        sayi=0;
        toplam=0; // bunları sıfırlamazsak usteki kaldıgı yerden devam eder
        int sayac=1;

        while (sayac<=sayiAdedi){

            System.out.println("Lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;
            System.out.println("girilen "+sayiAdedi + " sayinin toplamı : "+ toplam);

        }


    }
}
