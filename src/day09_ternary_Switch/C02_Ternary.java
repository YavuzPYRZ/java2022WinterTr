package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        // Ternary ile yapılan tüm işlemler if else ile de yapılabilir.
        // Ternary tercih etme sebebe-i basit ve anlaşılır olamsıdır

        // kullanıcıdan bir tam sayı alıp tek mi çift mi yazdıran bir kod yazalım

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Sayi çift");

        }else {
            System.out.println("sayı tek");
        }

        System.out.println(sayi%2==0 ? "sayı cıft" : "sayı tek"); // burası Ternary


    }
}
