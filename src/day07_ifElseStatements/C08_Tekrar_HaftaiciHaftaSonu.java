package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C08_Tekrar_HaftaiciHaftaSonu {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lülfen Bir Gün Giriniz");
        String gunIsmi = scan.next().toLowerCase(Locale.ROOT);

        if (gunIsmi.equals("pazar")  || gunIsmi.equals ("cumartesi")){
            System.out.println("Girdıgınız gun Haftasonu");

        }

        if (gunIsmi.equals("pazartesi")  || gunIsmi.equals ("salı") ||
            gunIsmi.equals("carsamba")  || gunIsmi.equals ("persembe") ||
            gunIsmi.equals("cuma"))
           {
            System.out.println("Girdigınız Gun Hafta Icı");
        }

    }
}
