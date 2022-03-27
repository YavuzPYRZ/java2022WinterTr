package day15methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {
        // kullanicidan bir kelime isteyin
// eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
// eger kelime 3,4 veya 5 harfli ise hardf sayisini ve
// kelimenin tersten yazilisini yazdirin
// eger 5 harften uzunsa "kelime cok uzun" yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lurfen bir kelime giriniz");
        String kelime = scan.next();

        int harfSayisi=kelime.length();

       if (harfSayisi<3){
           System.out.println("kelime kısa");

       }else if (harfSayisi==3){
        ucHarfiTersineCevir(kelime);

       }else if (harfSayisi==4){
           dortHarfiTersineCevir(kelime);

       }else if (harfSayisi==5){
           besHarfiTersineCevir(kelime);

       }else {
           System.out.println("Kelime cok uzun");
       }

    }

    private static void besHarfiTersineCevir(String kelime) {
        String  tersKelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdigınız kelimenin harf sayısı 3: ");
        System.out.println("Kelimenin Tersten yazılması : "+ tersKelime);

    }



    private static void dortHarfiTersineCevir(String kelime) {
        String  tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdigınız kelimenin harf sayısı :4 ");
        System.out.println("Kelimenin Tersten yazılması : "+ tersKelime);

    }


    private static void ucHarfiTersineCevir(String kelime) {
        String  tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdigınız kelimenin harf sayısı : 3 ");
        System.out.println("Kelimenin Tersten yazılması : "+ tersKelime);

    }
// method olusturmak için methodun adını yazarız
    //parantezlari koyarız ki bu method oldugunu anlar
    // maus la ctrl ile method olusturacagımız yazının uzerine gel sol altta cıkana tıkla
    // mehhod a giderken goturmem gereken veriable varsa , bunu method'a eklemeliyim



}
