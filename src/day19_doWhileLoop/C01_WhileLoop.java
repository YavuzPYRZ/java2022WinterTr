package day19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*

        Kullanicidan bir sayi alin ve
        bu sayiyi tam bolen sayilari ve
        toplam kac tane olduklarini ekranda yazdirin
         */

        int input=20;
        // for loop ile de yapabiliriz biz
        // while loop ile yapalım
        int bolen=1;
        int sayac=0;

        while (bolen<=input){ // 1 den başlayaak kullanıcının sayısına kadat gidecek
            if (input%bolen==0){

                System.out.println(bolen+ " ");
                sayac++;

            }
            bolen++; // bir sonrakı sayıyı kontrol edenilmesi icin boleni 1 arttırdık

        }
        System.out.println("");
        System.out.println(input+" sayısını bolen "+ sayac+" adet sayı vardır" );
    }
}
