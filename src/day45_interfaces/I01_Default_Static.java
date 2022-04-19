package day45_interfaces;

public interface I01_Default_Static {

    /*

    Interface lerde sdece abstract method lar bulunur

    body si olan concreate bir method oluşturdugumuzda Java CTE veriri.

    ancak Java8 ve sonrasında istisnai olarak statik veya default olark tanımlanan method ların bady si olabilir.

    Ancak burada kullanılan defaul keyword u access modifier degildir.
    Cunku ınerface lerde tum meethodlar public ve abstract dı.
    Aşagıdaki ornekte gorulecegi gibi defaul olark tanımlanmış bir method a access modifier olark public yazabilirsiniz.
    (access modifier yazmasak da Java method u public olarak kabul edecektir. )
     */

    void method1();

    default void  method2(){
        System.out.println("Interface deki defaul method ");
    }

    static void method3(){
        System.out.println("Inerface deki statik method  ");
    }
}
