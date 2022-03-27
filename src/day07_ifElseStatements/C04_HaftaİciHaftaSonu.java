package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaİciHaftaSonu {
    public static void main(String[] args) {
        /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
             Ornek:  gun=Pazar output = “Hafta sonu”
             gun=Sali output = “Hafta ici”
             *** String icin equals method’unu kullanin
         */
        //pazar veya cumartesi ile ===> hafta sonu
        // p salı ç perş. veya cuma ise ===> hafta içi

        //String case sensitive dir
        // yani pazar Pazar PAZAR PAzar hep farklı kelimeler
        // bu durumda string methotlarından yardım alırız

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Gun ismini yazınız");

        String gunIsmi=scan.nextLine().toLowerCase();//kullanıcı nasıl girerse girsin küçük harflar olacak
        // artık gunIsmi degeri artık kucuk harfli oldu...

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("gürdiğiniz gün hafta sonu");

        }
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("salı") ||gunIsmi.equals("carsamba")
                ||gunIsmi.equals("persembe") ||gunIsmi.equals("cuma") );
        System.out.println("girdigüniz gün hafta içi");
        // BAK HATALI SANKI....
    }
}
