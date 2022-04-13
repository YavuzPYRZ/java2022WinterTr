package day43_grbage_abstractClass;

public abstract class C04 {

    /*
    bir abstract class da veya concrete method lar bulunabilir.
    child class ların abstrat mothok ları override etmesi MECBURİ ikin
                      concrete method ların override edilmesi OPSİYONEL dir
     */

    public abstract void method1();

    public void concreteMethod(){

        System.out.println("C04 concreta method");
    }

////     public static   -----yazzzzzzzzz-------

    public static void main(String[] args) {

       /*
        abstage class lar constructor a sahiptir ancak Abstrack class lardan OBJE OLUSTURULAMAZ

        Abstrack class lar obje barındırmayan sadece child class lar için UYULMASI SART OLAN veya OPSİYONEL bırakılan
        ozellikleri tanımladıgımız bir depo class gibidir.
        C04 obj = new C04() {

        }*/
        System.out.println("bu class abstract");
    }
}
