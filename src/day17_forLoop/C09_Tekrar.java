package day17_forLoop;

import java.util.Scanner;

public class C09_Tekrar {
    public static void main(String[] args) {


        /*
not hesaplayici
   A => 90 ~100
   B => 80 ~ 89
   C => 70 ~ 79
   D => 60 ~ 69
   F =>  0 ~ 59
 */
        Scanner scan = new Scanner(System.in);

       // System.out.println("Notunuzu Giriniz");
        int not=scan.nextInt();

        if (not<0 || not>100){
            System.out.println("Lütfen notunuzu kontrol edin");

        } else if (not<=59){

            System.out.println("notunuz F");
        }
        else if (not<=69){

            System.out.println("notunuz D");
        }else if (not<=79){

            System.out.println("notunuz C");
        }else if (not<=89){

            System.out.println("notunuz B");
        }else System.out.println("Notunuz A");

    }
}
