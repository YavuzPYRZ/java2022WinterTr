package day11_StringManipolatıons;

public class C05_indexOf {
    public static void main(String[] args) {
        String str1="Java Bir Baska Guzel";

        //isterse char olarak dondurur
        System.out.println(str1.indexOf('J')); // 0

        // istesek metin olaka verdiğimiz String in ındex'ini verir
        System.out.println(str1.indexOf("aska")); // 10 aska nın baslangını a 10 dur


        System.out.println(str1.length()-1); // 19


        // aynı harften  birden fazla varsa ?
        System.out.println(str1.indexOf("b")); //buraya -----BAAAAAAAKKKKKKKK-----
    }
}
