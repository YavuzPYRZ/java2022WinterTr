package day08_ifElseIfStatements;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class C09_calıslma {
    public static void main(String[] args) {

          /* TASK :
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.

        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!

        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.

        5. final notu double değerinde olmalı. (örn: 65,5)

        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.

        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı,
        finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.

        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.



                                        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                                                        80(80dahil)   ile 90 arasında ise  BA,
                                                                        70(70 dahil)   ile 80 arasında ise BB,
                                                                        60(60dahil) ile 70 arasında ise CB,
                                                                        50(50 dahil) ile 60 arasında ise CC,
                                                                     40(40 dahil) ile 50 arasında ise DC,
                                                                     30(30 dahil) ile 40 arasında ise DD,
                                                                     30 'dan düşük ise FF            gelmeli.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("vize notu girin");
        double vizeNotu = scan.nextDouble();

        System.out.println("final notu");
        double finalNotu = scan.nextDouble();

        System.out.println("final oranı");
        double finalOranı = scan.nextDouble();

        double sonuc = (finalNotu * finalOranı / 100) + (vizeNotu * (100 - finalOranı) / 100);

        if (vizeNotu < 0 || vizeNotu > 100 || finalNotu < 0 || finalNotu > 100 || finalOranı < 0 || finalOranı > 100) {
            System.out.println("Hatalı giriş yaptınız");

        } else if (sonuc >= 90) {
            System.out.println("AA aldınız");
        } else if (sonuc >= 80) {
            System.out.println("BA aldınız");
        } else if (sonuc >= 70) {
            System.out.println("BB aldınız");
        } else if (sonuc >= 60) {
            System.out.println("CB aldınız");
        } else if (sonuc >= 50) {
            System.out.println("CC aldınız");
        } else if (sonuc >= 40) {
            System.out.println("DC aldınız");
        } else if (sonuc >= 30) {
            System.out.println("DD aldınız");
        } else {
            System.out.println("malesef kaldınız");
        }

    }
}
