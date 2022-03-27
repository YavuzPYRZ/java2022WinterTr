package day03_scanner;

import java.util.Scanner;

public class C03_Scanner_Ornekler {
    public static void main(String[] args) {

        /*

        Scanner scan= new Scanner(System.in);

        System.out.println("İsminizi Giriniz");

        char ilkHarf =scan.next().charAt(0);//charAt(Index) methodu parametre olarak
                                        // yazdığımız indexdeki char ı bize getirir.
                                        // ilk parametre 0 dır ...0,1,2,3,4, diye gider
        System.out.println("Girdiğiniz ismin ilk harfi "+ilkHarf);
        */

        /*
        // kullanıcıdan ismi al ilk harfi yazdır

        Scanner scan = new Scanner(System.in);

        System.out.println("Adınızı Giriniz");

        char ilkHarf = scan.next().charAt(0);
        System.out.println("Adınızın İlk Harfi "+ ilkHarf);
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Adını Gir loo ");

        char ilkHarf=scan.next().charAt(0);
        System.out.println("Adınızın İlk Harfi "+ilkHarf);

    }
}
