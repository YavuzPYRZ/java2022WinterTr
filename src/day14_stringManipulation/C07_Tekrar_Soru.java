package day14_stringManipulation;

import java.util.Scanner;

public class C07_Tekrar_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan isim soyisim ve kk bilgisi iste
        // isim-soyisim: M*** B****
        //Kart No: **** **** **** 1234 gibi yazdır

        Scanner scan = new Scanner(System.in);
        System.out.println("Adınızı  Giriniz");
        String ad = scan.nextLine();
        System.out.println("oyadınızı Giriniz");
        String soyad = scan.nextLine();
        System.out.println("Kart No  Giriniz");
       String kKNo =scan.next();

        System.out.println("İsim soyisim :"+ad.substring(0,1).toUpperCase()+
                        ad.substring(1).replaceAll("\\S","*")+" "+

                            soyad.substring(0,1).toUpperCase()+
                        soyad.substring(1).replaceAll("\\S", "*")
                );


        System.out.println("Kart No :**** **** **** " +kKNo.substring(12));



    }
}
