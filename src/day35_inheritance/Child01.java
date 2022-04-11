package day35_inheritance;

public class Child01 extends Parent {

      //  Child class hic bir objeye ihtiyac duymadan
     //   parent class'daki variable ve method'lara ulasabilir
      public static void main(String[] args) {
          System.out.println(isim); // Neval
          System.out.println(fabrika); // Yildiz Tekstil
          method1();
          method2();

         Parent obj = new Parent();


      }


}

