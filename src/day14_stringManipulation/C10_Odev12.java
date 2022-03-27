package day14_stringManipulation;

import java.util.Scanner;

public class C10_Odev12 {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("birşayler yaz");
        String str = scan.nextLine();

        int bosluk = str.indexOf(' '); //

        if (bosluk == -1) {
            System.out.println("bosluk yoktur");
        } else {
            System.out.println("bosluk vardir");
        }


        if (!(str.isEmpty())) { // boş mu dolumu
            System.out.println("birşeyler yazdınız girilen metin var");
        } else {
            System.out.println("Hicbirşey yazmadın bro");
        }

    }


}
