package day03_scanner;

import java.util.Scanner;

public class C04_ScannerSorular {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);// dısarıdan veri alır
        /*
        System.out.println("Karenenin Kenar Uzunluğunu Yaz");
        int kareKenarUzunlugu=scan.nextInt();
        System.out.println("Karenen Cevresi : "+kareKenarUzunlugu*4);
        System.out.println("Karenin Alanı : "+kareKenarUzunlugu*kareKenarUzunlugu);
        */

        /*System.out.println("Kullanıcı Isim giriniz");
        String kullaniciIsmi=scan.next();
        System.out.println("Kullanıcı Soy Isim Giriniz");
        String kullaniciSoyadi=scan.next();

        System.out.println("Isim - Soyisim: "+kullaniciIsmi+" "+kullaniciSoyadi);
        */

        System.out.println("cemberin yarıcapını yazınız");
        double yaricap=scan.nextDouble();
        System.out.println("Girdiğiniz yarıcap :"+yaricap);
        System.out.println("Dairenin cevresi : "+2*3.14*yaricap);
        System.out.println("Dairenin Alanı : "+3.16*yaricap*yaricap);


    }
}
