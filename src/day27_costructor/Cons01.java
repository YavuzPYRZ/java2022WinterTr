package day27_costructor;

public class Cons01 {
  public Cons01(String par1){ // burası her yerden kullanılabilir cunku public
      System.out.println("parametreli");
   }

   Cons01(){ // default (public degil) oldugundan sadece bu package de kullanılabilir
       System.out.println("parametresiz");
    }
}
