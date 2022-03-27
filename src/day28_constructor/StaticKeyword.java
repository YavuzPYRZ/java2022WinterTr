package day28_constructor;

public class StaticKeyword {
    static int sayi1;
    int sayi2;

    public static void main(String[] args) {

        /*
        * Statik veriable'ler direk class a baglıdır
        * Class içerisinde yapılan her turlu degisiklik satitik variable'lerde kalıcı olur
        *
        * Instans verianle'ler ise obje'ye baglıdır ve sadece obje uzerinden erisilebilr
        * ve bir obje uzerinden erisilerek yapılan degisiklik Instance veriable'nin tum objeler için
        *  kalıcı olarak degistirmez sadece o obje için instance veriable degerini kalıcı olarak degistitr.

        * */
        System.out.println("sayi1 : "+sayi1); // 0
      //  System.out.println("sayi2  :" + sayi2); // statik main methodun içine statik olmayan SEFİL sayi2 yi kullanamazsın

        StaticKeyword obj1= new StaticKeyword();

        System.out.println(obj1.sayi2); // 0

        sayi1++;
        obj1.sayi2++;
        System.out.println("sayi1 : " +sayi1); // 1
        System.out.println(obj1.sayi2); // 1
        System.out.println(obj1.sayi1); // 1 // obj1 uzerinden sayi1 i yazmaya gerek yok (sen direk yazdırabilirsin)
                                        // ama sen bilirsin diyor

        StaticKeyword obj2 = new StaticKeyword();
        System.out.println(obj2.sayi2); // 0  // obj1 de degistirdigimiz deger sadece orada kalır..
        System.out.println(obj2.sayi1); // 1

        obj2.sayi1++;
        obj2.sayi2++;
        System.out.println(obj2.sayi2); // 1
        System.out.println(obj2.sayi1); // 2

        System.out.println(obj1.sayi2); // 1
        System.out.println(obj1.sayi1); // obj1 uzerinden sayi1 e atama yapmadık ama Statik oldugundan her yerde etki eder

        obj1.sayi1++;
        obj1.sayi2++;
        System.out.println(obj1.sayi2); // 2
        System.out.println(obj1.sayi1); // 3

        System.out.println(obj2.sayi2); // 1
        System.out.println(obj2.sayi1); // 3


    }
}
