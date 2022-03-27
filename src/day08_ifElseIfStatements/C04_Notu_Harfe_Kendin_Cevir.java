package day08_ifElseIfStatements;

import java.util.Scanner;

public class C04_Notu_Harfe_Kendin_Cevir {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Not Ortalamanız 100 Uzereniden Giriniz");

        double sayi=scan.nextDouble();

        if (sayi<0 || sayi>100){
            System.out.println("Lütfen Gecerli Bir Sayi Giriniz");
        }

        else if (sayi<50){
            System.out.println("Notunuz D");
        }

        else if (sayi<60){
            System.out.println("Notunuz C");
        }

        else if (sayi<80){
            System.out.println("Notunuz B");
        }else {
            System.out.println("Notunuz A");
        }

    }

}
