package day11_StringManipolatıons;

import java.util.Locale;

public class C01_toLowerCase_toLoverCase {
    public static void main(String[] args) {
        String str = "Java Guzeldir";

        // biz string methotlrını arka arkaya kullanabiliriz
        // mesela 2 kelimenin ilk harfini kucuk yazdıralım.

       // str.charAt(5); //boyle yazdığımızda sonuc artık String degil char olacaktır.
                        // dolayısıyla String de yapmak istedigimiz tum degisikleri yapıp sonra charAt kullanalım.
        ;
        System.out.println(str.toLowerCase().charAt(5)); // Guzeldir in buyuk G si küiçüldu
        System.out.println(str.toLowerCase().charAt(0)); // j küculdu
        System.out.println(str.toUpperCase().charAt(2)); // V buyudu

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
                                                        // JAVA GUZELDİR ing klavyede bile İ yazabilir


    }
}
