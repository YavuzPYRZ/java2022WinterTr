package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
// bir class i child class yptıgımızda
    // parent class daki constructor a ulasması gerekir
    //bu durumda parent class daki constotutor ın
    //access modigier i uygun mıdifier yapılmalıdır.

 Child(){
    super();

        System.out.println("child class paremetresi cons");
    }
    Child (int s){

     /*
     Child class da tüm const. ların ilk satırına
     Javnın yerleştirdigi cons. PARAMETRESİZ dir yani super();
      */
       // super();// gormesekde burada vardır.
        System.out.println("Child class parametreli cons");
    }

    Child (int sayi1, int sayi2){
     /*
     eger parent class'dan parametresiz constructor'u degil de
     baska bir consturctor'u calıstırmak istersek
     bunu Child class'daki constructor'ın ILK SATIRINA yazmalısınız
      */
     super(sayi1 , sayi2); // eger Parent deki gitmek istedigimiz cons.'ın
        // access modifier'ı uygun degilse super altını cizer ve CTE verir.
        System.out.println("Child iki parametreli cons.");
    }


    public static void main(String[] args) {
        Child child = new Child(5);
    }

}
