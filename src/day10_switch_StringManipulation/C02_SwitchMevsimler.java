package day10_switch_StringManipulation;

import java.util.Scanner;

public class C02_SwitchMevsimler {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("bir ay numarası giriniz");

        int ayNo=scan.nextInt();

        // kullanıcıdan kacıncı ay oldugunu al mevsimi yazdır

        switch (ayNo){

            case 12:
            case 1:
            case 2:
                System.out.println("kış");
                break;


            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar");
                break;


            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;


            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;

            // switch içine yazılan variable nın degerine gore ilgili casi bulur
            // ve break gorene kadar kodu çalıştırır eger break (kırmak demek)
            // yoksa ilgili caseden asagı dogru tum case ler calısır


            default: // if elsenin sonundaki else gibi bir satır ekleyebiliriz
                System.out.println("Lütfen gecerli bir ay giriniz");


        }
    }
}
