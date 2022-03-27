package day16_methodCreation;

public class C02_Overloading { // aşırı yukleme

    public static void main(String[] args) {
        String str = "Buda geçer ya Huu";

        System.out.println(str.indexOf("d")); // 3
        System.out.println(str.indexOf("a",5));
       //  System.out.println(str.indexOf());


                // bir class da aynı isimde birden fazla method olmasına overloading denir
        // ya parametse sayısı farklı olmalı
        // veya argümet sayısı aynı ile argümentlerin data türleri farklı olmalı

    }
}
