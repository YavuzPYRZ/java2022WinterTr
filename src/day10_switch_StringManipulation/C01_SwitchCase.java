package day10_switch_StringManipulation;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir ay numarası giriniz");

        int ayNo=scan.nextInt();
        // bu soruyu if else ile yapabiliriz ama 12 if else çok kalabalık ve anlaşılması guc olabilir
        // bunun yerine swich - case yapısını kullanabiliriz

        switch (ayNo){

            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
                // switch içine yazılan variable nın degerine gore ilgili casi bulur
                // ve break gorene kadar kodu çalıştırır eger break (kırmak demek)
                // yoksa ilgili caseden asagı dogru tum case ler calısır"


            default: // if elsenin sonundaki else gibi bir satır ekleyebiliriz
                System.out.println("Lütfen gecerli bir ay giriniz");


        }
    }
}
