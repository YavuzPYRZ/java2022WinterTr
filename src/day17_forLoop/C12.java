package day17_forLoop;

import java.util.Scanner;

public class C12 {
    public static void main(String[] args) {
/*
        for (int i = 1; i <=10 ; i++) {

            System.out.println(i+" Java güzeldir");
        }

        int baslangic=10;
        int bitis=30;

        for (int i =baslangic; i <=bitis ; i++) {
           if (i<bitis){
               System.out.print(i+ ",");
           }else {
               System.out.print(i);
           }
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("100 den kucuk bir sayı giriniz");
        int sayi=scan.nextInt();

        for (int i = 0; i <=sayi ; i++) {

            if (i%3==0 || i%5==0){
                System.out.print(i+" ");
            }
        }
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char ilkHarf=scan.next().charAt(0);

        System.out.println("ikinci harf giriniz");
        char ikinciHarf=scan.next().charAt(0);

        for (char i =ilkHarf; i <=ikinciHarf ; i++) {
            System.out.print(i+" ");


        }
    }

}
