package day36_inheritance;

public class Child extends Parent{

    Child(){
      super();  //   burayı yazsak da burad yazmasak da burada..
        System.out.println("child constructor calıştı");

    }
// tüm class larda biz gormesek bile
// Javanın olusturdugu defaul cons. vardır.

// Extends keyword kullanan class'lardaki
// tüm CONSTRUCTOR ların ilk satırında biz gormesek bile super() constructor call vardır.
// yani parent class'ın parametresiz constructor call
    public static void main(String[] args) {
        Child child =new Child();
    }

}
