package day40_overriding_polymorphism;

public class C04_Exception {
    /*
    String olarak verilen bir sayıyı, integer'a çevirip 2 katını ekrana yazdıralım
     */

    public static void main(String[] args) {
        String str = "12345";
        int sayi = Integer.parseInt(str);
        // str için de sayı olmayan bir karakter olursa NumberFormatException.forInputString verir. 
        System.out.println("girilen sayının 2 katı : " + 2*sayi);
    }
}
