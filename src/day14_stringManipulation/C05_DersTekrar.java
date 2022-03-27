package day14_stringManipulation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C05_DersTekrar {
    public static void main(String[] args) {
        //4 harfli bir meetni tersten yazdırma

     /*   Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir metin giriniz");
        String tesCevir = scan.next();

        String yeniKelime = tesCevir.substring(3).toUpperCase()+
                            tesCevir.substring(2,3).toLowerCase()+
                            tesCevir.substring(1,2).toLowerCase()+
                            tesCevir.substring(0,1).toLowerCase();

        System.out.println(yeniKelime);

        */
        String isim="ozge";
        String soyisim="Poyraz";
        String kkno="1234567812345678";

        // ismi ve soy ismi ilk harfleri büyük sonraı yıldız
        // KK nı ilk 12 yildız sonrası rakam olsun

        String yeniisim=isim.substring(0,1)+isim.substring(1).replaceAll("\\w", "*");

        String yenisoy=soyisim.substring(0,1)+soyisim.substring(1).replaceAll("\\w", "*");



        System.out.println(yeniisim);
        System.out.println(yenisoy);
        System.out.println("**** **** **** "+kkno.substring(12));

    }
}
