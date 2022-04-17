package day42_exceptions;

import java.util.Scanner;

public class C04_soru {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayılardan oluşan bir metin girin ");
        String str =scan.next();


        int sayi = 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("yanlış giriş");
        }


        System.out.println("girilen sayinin iki katı  : "+sayi*2);





    }
}
