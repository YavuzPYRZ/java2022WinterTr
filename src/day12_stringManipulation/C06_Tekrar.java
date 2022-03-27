package day12_stringManipulation;

public class C06_Tekrar {
    public static void main(String[] args) {
        String str = "Canim Kizlarim";

        System.out.println(str.lastIndexOf("i")); // 12 dondurdu

        System.out.println(str.lastIndexOf("iz",7)); // 7

        System.out.println(str.contains("Kizlar")); // true
        System.out.println(str.contains("C"));// true
        System.out.println(str.contains("o")); //false

        //aradığımız metin de Kizlarım yazmıyora lütfen yazımı düzelt
                            //  yazıyorsa kız babası yazsın//
        //                  Kizlarım içermiyorsa kız babası degılsin yazsın

        String arananMetin= "Oglanlarım";

        if (str.endsWith(arananMetin)){
            System.out.println("Kız babası");

        } else {
            System.out.println("Keşle kızlarım olsa :)  ");
        }


    }
}
