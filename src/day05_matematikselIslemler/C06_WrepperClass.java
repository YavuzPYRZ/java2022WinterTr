package day05_matematikselIslemler;

public class C06_WrepperClass {
    public static void main(String[] args) {
        String str1="12345";
        String str2="23456";

        //verilen string  deki sayiları toplayın

        System.out.println(str1+str2); // yan yana yazdırır 1234523456

        System.out.println(Integer.valueOf(str1)   +   Integer.valueOf(str2)); //35801
    }
}
