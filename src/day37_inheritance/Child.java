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
        // Child class'da tum comstructor'ların ilk satırında
        // Java'nın yerleştirdigi cons PARAMETRESİZ dir yani su..

        System.out.println("Child class parametreli cons");
    }

    public static void main(String[] args) {
        Child child = new Child(5);
    }
}
