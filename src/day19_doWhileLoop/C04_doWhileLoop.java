package day19_doWhileLoop;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {
        /*
                Kullanicidan toplamak uzere pozitif sayilar isteyin,
                islemi bitirmek icin 0’a basmasini soyleyin.
         Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
         “Negatif sayi giremezsiniz” yazdirip basa donun
         Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
         yanlislikla kac negative sayi girdigini ve
         girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */

        Scanner scan =new Scanner(System.in);
        int sayi =100; // burada ne verirsen ver asagıda kullanıcıdn aldıgımız sayıya esitlenecek
        int toplam=0;

        int sayacPozitif=0;
        int sayacNegatif=0;

       do {
           System.out.println("Kullanicidan toplamak uzere pozitif sayilar girin\n bitirmek için 0 a basın ");
           sayi=scan.nextInt();
           if (sayi<0){
               System.out.println("Negatif sayı giremezsinz");
               sayacNegatif++;

           }else if (sayi>0) {
               toplam += sayi;
               sayacPozitif++;

           }
           }while (sayi !=0);
        System.out.println("Yanlışlıkla girilen negarig sayı adedi : "+ sayacNegatif);
        System.out.println("Girilen pozitif syı adede : "+sayacPozitif);
       System.out.println("girilen pozitif sayiların toplamı "+toplam);


    }
}

