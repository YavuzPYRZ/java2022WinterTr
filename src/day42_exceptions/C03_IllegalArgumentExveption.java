package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentExveption {
    public static void main(String[] args) {
        /*

        kullanıcıdan yasını isteyin
        kullanıcı yas olarak negatif bir sayi 0 veya 120 den buyuk bir sayi girerse illegalArgumentExcepton
        olusturacak sekilde bir program yazınız
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yaaısnızı girinzi");
        int yas = scan.nextInt();

        if (yas<=0 || yas>120){
          //  System.out.println("lütfen geçerli bir yas giriniz");
            // Java bizim istedigimiz durumlarda excepton fırlatabilir.
            throw  new IllegalArgumentException();
        }else{
            System.out.println("uygun yas girdiniz tesekkurler.");
        }
    }
}
