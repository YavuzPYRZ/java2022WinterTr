package day19_doWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {

        Random rnd =new Random();
        int sayi= rnd.nextInt(100);


        Scanner scan = new Scanner(System.in);
        int kullanıcınınTahmini = scan.nextInt();

         int kacKeredeBildi=1;

        while (kullanıcınınTahmini!=sayi) {
            System.out.println();
            if (kullanıcınınTahmini > sayi) {
                System.out.println("Lütfen kücük bir sayı giriniz");
            }
            else if (kullanıcınınTahmini < sayi){
                System.out.println("Lütfen büyük bir sayı giriniz");
        }
            kacKeredeBildi++;


        }
        System.out.println("Tuttugum sayiyi :"+(kacKeredeBildi-1)+ "kerede bildiniz");

    }


}
