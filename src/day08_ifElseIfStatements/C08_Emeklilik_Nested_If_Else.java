package day08_ifElseIfStatements;

import java.util.Scanner;

public class C08_Emeklilik_Nested_If_Else {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen Yasınızı giriniz");

        double yas= scan.nextDouble();
        System.out.println("Cinsiyetinizi Giriniz\n Erkek icin E \n Kadın icin K");

        char cinsiyet=scan.next().toUpperCase().charAt(0);

        if (cinsiyet=='K'){
            if (yas<0 || yas>130){
                System.out.println("yanlış giriş yaptınız");

            }else if (yas>60){
                System.out.println("Emekl olabilirsin");
            } else{
                System.out.println("Emekli olamazsın");
            }
            //kadın ıcın
        }else if (cinsiyet=='E'){
            if (yas<0 || yas>130){
                System.out.println("yanlış giriş yaptınız");

            }else if (yas>65){
                System.out.println("Emekl olabilirsin");
            } else{
                System.out.println("Emekli olamazsın");
            }
            //erkek icin
        }else{
            System.out.println("Lütfen Geçerli bir Hrf giriniz");
        }
    }
}
