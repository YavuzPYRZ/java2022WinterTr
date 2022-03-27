package day13_stringManipulation;

import java.util.Scanner;

public class C05_tekrar {
    public static void main(String[] args) {
/*
		name1 ve name2 degiskenlerini olusturun.

		name1 degiskeninin karakter sayisi tek ise "" yazdirin.
		          e.g:
		         name1= meh met
		         name2= ahmet
		         Print ==> mehahmetmet
		*/

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String isim1=scan.nextLine();
        System.out.println("ikinci isim giriniz");
        String isim2=scan.nextLine();

        if (isim1.length()%2==0){
            System.out.println(isim1.substring(0,isim1.length()/2)+

                    isim2+ 

                    isim1.substring(isim1.length()/2));

        }else System.out.println("isim1 cift sayili olmadigi icin ortasina yerlestiremedik");



    }
}
