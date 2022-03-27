/*package day14_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_Practice_Tekrar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Şirketimize hos geldiniz");
        System.out.println("Frankfurt 15 Euro \nKoln 80 \n Km basına 5 euro ucretlendirme yapılır");
        System.out.println("Yolculuk yapacagınız sehri seciniz");

        String hedef =scan.next().toUpperCase();
        double bakiye = 100;
        double frUcret=(60/20)*5;
        double klUcret =(80/20)5;

        switch (hedef){
            default:
                System.out.println("Hatalı giriş yaptınız");
                break;
            case "FRANKFURT":
                System.out.println("Rota : Frankfurt");
                System.out.println("Frankfurt "+frUcret + "Euro");
                System.out.println("Kac kisi seyahat edecek");
                int kisi= scan.nextInt();
                switch (kisi){
                    case 1:

                        System.out.println("1 kisilik bilet talep ettiniz"+"Bilet tutarınız : "+frUcret + "Euro");
                        break;

                    case 2:
                        System.out.println("1 kisilik bilet talep ettiniz"+"Bilet tutarınız : "+frUcret*2 + "Euro");


                        break;
                    default:
                        System.out.println("Hatalı giriş yaptınız");
                            break;


                }

            break;



            case "KOLN":
                break;
        }

    }
}
*/
