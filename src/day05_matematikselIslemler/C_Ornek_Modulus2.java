package day05_matematikselIslemler;

import java.util.Scanner;

public class C_Ornek_Modulus2 {
    public static void main(String[] args) {

        //kullanıcıdan alınan değerin tek mi çift mi olduğunu bul.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir rakam giriniz");

        int alınanSayi = scan.nextInt();


        alınanSayi=alınanSayi%2;

        if (alınanSayi==0){
            System.out.println("Girdiginiz sayi cift sayıdır");
            }
        else{
            System.out.println("Girdigınız sayı tekdir");
        }

    }
}
