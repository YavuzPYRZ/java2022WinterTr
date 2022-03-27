package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C03_TekCift_Sayı {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen syı giriniz");
        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("girdigınız sayı cıft");
        } else {
            System.out.println("gürdigınız sayı tekdir");
        }




    }
}
