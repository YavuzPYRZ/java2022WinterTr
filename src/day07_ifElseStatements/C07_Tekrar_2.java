package day07_ifElseStatements;

import java.util.Scanner;

public class C07_Tekrar_2 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir Tam sayı giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Girdiğınız Tam sayı çift");

        }else System.out.println("Tek Sayı Girdiniz");

    }
}
