package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplamiBulma2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("4 basamaklı Bir Tam sayi giriniz");
        int sayi= scan.nextInt();

        int sondakiRakam=0;
        int rakamlarToplami=0;

        //ilk adımda sondaki rakam 0, rakamlar Toplamı =0  sayi 7532
        sondakiRakam=sayi%10;// 2
        rakamlarToplami+=sondakiRakam; //2
        sayi/=10; //753

        //2. adımda sondakirakam 2 rakamlartoplamı 2 sayi 753

        sondakiRakam=sayi%10;// 3
        rakamlarToplami+=sondakiRakam;// 2+3=5
        sayi/=10; //   753/10=(int)75

        //3. adımda sondakirakam 3 rakamlartoplamı 5 sayi 75

        sondakiRakam=sayi%10; // 5 (75 in kalanı)
        rakamlarToplami+=sondakiRakam; // 5+5 =10
        sayi/=10; // 75/10 dan 7 olur


        //4. adım soncakirakam 5 rakamlartoplamı 10 sayi7

        sondakiRakam=sayi%10; //7
        rakamlarToplami+=sondakiRakam; //10+7 ==> 17
        sayi/=10; //  0

        System.out.println("Rakamlar toplamı : "+ rakamlarToplami);

    }
}
