package day11_StringManipolatıons;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {
        //kullanıcıya derse katılıp katılmak istemediğini sorun
        // evet derse cevabını ve "derse katılımınız alınmıştır"
        // hayır derse cevabını ve "sonraki derslere bekleriz" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Derse Katılmak Istermiziniz");
        String cavap=scan.next();

         if (cavap.equalsIgnoreCase("evet")){

             System.out.println("Cevabınız : "+ cavap + "\n derse katılımınız alınmıştır");

         }else if (cavap.equalsIgnoreCase("hayır")){

            System.out.println("Cevabınız : "+ cavap + "\n sonraki derslere bekleriz");
        } else{
             System.out.println("Lutfen Evet Yada Hayır Yazınız");
         }

    }
}
