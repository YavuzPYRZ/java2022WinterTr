package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
                /*Soru 13 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim
        tablosu olusturun. Ornek,kullanici 3 girerse,
        *
        * *
        * * *
        * * * *
         */
        int input = 5;
       // int input2= 8;

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
                // nested for loop ya dikdortgen veya ucgen formatında olabilir
                // dikdörtgen iki loop için de bagımsız en point belirleriz
                // ucgen sekli vermek icin inner loop'un end point ini olarak auter degıskene baglı yaparız
            }
            System.out.println("");
        }


    }
}
