package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // new demek bana yeni bir scanner oluştur demek oluyor.
        // bunu da scan variable sine yükleyecek.

        /* kullanıcıdan istediğimiz degeri girmesi için açıklayıcı bir bilgi yazdırın
         */
        System.out.println("Lütfen isminizi giriniz");

        /* 3. adım kullanıcının girdiği değerei uygun variable oluşturup kaydedin.
         */
        // String kullaniciIsmi=scan.next();  bu kod sadece ilk boşluğa kadar kısmını alır.
        String kullaniciIsmi=scan.nextLine();
        System.out.println("Kullanınının girdiği isim ="+kullaniciIsmi);



    }
}
