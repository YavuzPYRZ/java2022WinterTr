package day05_matematikselIslemler;

public class C02_PreIncrementPostIncrement {

    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++; // sayi2 ye once sayı1 e esitledi (ilk islem) sonra sayi1 i 1 arttırıp aynı anda degeri atadı

        System.out.println(sayi1+","+sayi2+","+ sayi3);

        sayi3=++sayi1; //once arttırma yapılır(++ solda) sayı1 1 arttrı
                        // sonra atama yapılır sayı3 sayı 1 e atanır

        System.out.println(sayi1+","+sayi2+","+ sayi3);

        System.out.println(sayi3++); //once yazdır sonra arttırır
                                    //once 12 yazdıracak sonra sayı3 13 olacak ama yazdıramaz hafıza da kalır

        System.out.println(--sayi2);//once azalt sonra yazdır  10u azalt 9 olur... sonra yazdır


    }
}
