package day08_ifElseIfStatements;
import java.util.Scanner;

public class C02_NotuHarfeCevirme_Kısa {
    public static void main(String[] args) {
        /*Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        Not’u harf sistemine cevirip yazdirin.
         50’den kucukse “D”,
          50-60 arasi “C”,
           60-80 arasi “B”,
            80’nin uzerinde ise “A”
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double notSayi=scan.nextDouble();

        if (notSayi<0 || notSayi>100){
            System.out.println("yanlış giriş");
        }
        else if (notSayi<50){
            System.out.println("Notunuz D");

        }else if (notSayi<60){
            System.out.println("Notunuz C");
        }else if (notSayi<80){
            System.out.println("Notunuz b");
        }else {
            System.out.println("Notunuz A");
        }

    }
}
