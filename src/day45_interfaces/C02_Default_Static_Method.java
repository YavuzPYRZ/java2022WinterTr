package day45_interfaces;

public class C02_Default_Static_Method implements I01_Default_Static{
/*
Bir interface de defaul veya static olarak tanımlanan
ve bady si olan method ların override edilmesi MECBURİ DEGİLDİR, opsiyoneldir.
Eger  static olark tanımlanmışsa zaten override edemeyiz.
 */
    @Override
    public void method1() {
        System.out.println("child class method1");
    }

    // parent interface deki default olarak tanımlanan method u isstersek override ederiz istemezdek etmeyiz.
    // override etmezsek method cagrıldıgında parent interface deki calışır. override edersek child edersek
    // child class daki override method calışır.

    public static void main(String[] args) {
        /*
        Inerface de static olarka tanılanan method'lara static yontemlerle ulaşılabilir. InterfaceIsmi.methodIsmi
         */
        I01_Default_Static.method3();
        C02_Default_Static_Method obj = new C02_Default_Static_Method();

        obj.method1(); // child class dan çalışır
        obj.method2();// bende yok o zaman parent e gider onu calıştırır
        // obj.method3();  eski classlarda static bir uyeye statik olmayan yollarlar ulaşabilirdik
        // ancak interface icerisinde static olarak tanımlanan meethod'a static olmayan yontermlerle ulaşılamaz
    }
}
