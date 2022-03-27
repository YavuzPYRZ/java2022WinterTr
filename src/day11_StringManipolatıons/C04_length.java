package day11_StringManipolatıons;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {


        //kullanıcıdan ismini alıp bas harfini ve son harfini buyuk harflarle yazdırın
        Scanner scan =new Scanner(System.in);
        System.out.println("Lüften isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("ilk harf : "+ isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf : "+ isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));


    }
}
