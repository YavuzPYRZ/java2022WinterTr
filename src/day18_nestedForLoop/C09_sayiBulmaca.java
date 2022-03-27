package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class C09_sayiBulmaca {
    public static void main(String[] args) {


        Random rnd=new Random();
        int sayi= rnd.nextInt(100); // burası 100 den kucuk rasgele bir sayi olusturacak // baund = sınır demek

        Scanner scan=new Scanner(System.in);
        int tahmin=0;
        int sayac=1;

        while (sayi != tahmin){
            System.out.println("Lütfen bir sayı giriniz");
            tahmin = scan.nextInt();

            if (tahmin>sayi){
                System.out.println("Daha kucuk bir sayı yazmalısın");

            }else  if (tahmin<sayi){
                System.out.println("daha buyuk bir sayı yazmalısı");
            }
            sayac++;


        }
        System.out.println("tutugum sayıyı "+(sayac-1) + " tahminde buldunuz");

    }
}
