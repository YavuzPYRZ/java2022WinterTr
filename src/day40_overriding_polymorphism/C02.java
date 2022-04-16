package day40_overriding_polymorphism;

public class C02 extends C01 {
    @Override
    /*
    @Override notasyonu ovirridden mothod ile overridding method u birbirine baglar.
    yanlışlıkla overridden method silinirse veya signature degiştitilirse
    bu ilişki bozulacagı için Java CTE verir.

    Notasyon kullanılmazsa Java bunların ilişkisini bilir
    ama ovirridden method silinirse sesini cıkarmaz.
     */
    protected void method2() {
        System.out.println("Child method 2");
    }

    public static void main(String[] args) {
        C02 obj = new C02();
        obj.method1(); //parent method 1
                        // ben bu clasdayim data turum de bu clss
                        // o zaman ilk kendime bkacagım
                         // yoksa parentime bakarım.
        obj.method2(); // Child method 2


        C01 obj2 = new C02(); // data tutu C01(Parent) den constructor child den
        obj2.method1();// parent method1
                        // once data turu clasına bakar.orada method1 varmı.
                        // yoksa CTE verir.
                        // varsa yazdırmaz override yapılmış mı diye bakar.
                        // override edilmiş ise child clasdakini kabul eder.
                        // burada override edeimedigi için meethod 1 yazdırdı.

        obj2.method2();// Child method 2     override edildigi için

        C01 obj3 = new C01();
        obj3.method1(); // parent method 1
        /*
        Cunku bizim data turuumuz parent AMA constructor da Parent bu nedenle
        biz butun işlemlerimiz Parentte gore yaparız. Konsolosluk gibi
        overriding edilmiş mi diye BAKMAYIZ.
         */
        obj3.method2();// parent method 2



    }
}
