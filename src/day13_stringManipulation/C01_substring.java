package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str = "Java ile IT cok guzel";

        System.out.println(str.substring(5));// ile IT cok guzel
        // yukarıdaki metni kullanarak mehmet ile IT cok guzel yapalım
        System.out.println(str.replace("Java", "Mehmet Hoca"));

        System.out.println("Mehmet Hoca " + str.substring(5));

        // IT cok güzel yazsın
        System.out.println(str.substring(9));//yazılan index inclusive(dahil)

        // eger bir indexden sona kadar olan parcayı degıl belirlı bir parcayı almak istesek
        //2 parametre yazmak gerek.  str.substring(baslangıcIndexi, bitisIndeksi
        //baslangıc indexi Inclusiv dir ama bitis indexi exlusive dir

        System.out.println(str.substring(0, 5));// Java ve space   5.index almaz
        System.out.println(str.substring(0, 5));// Java i

        str.charAt(6); // bana 6. harfi String olarak bulun? string olmadı dikkat
        String harf=str.substring(5,6); // 5. dahil olsun 6. Index dahil olmasın
        System.out.println(harf); // i verdi

        str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7,7)); // hiçlik verir
                                                // 7 den baslayacak dedi ama 7 yi yazdıramayacak dedi hiclik verdi

//        System.out.println(str.substring(5,2)); // hata verir bitis indexi baslangıctan kucuk olamaz
        System.out.println(str.substring(str.length()-1)); // son harfi String olarak verir

        // son 5 harfi istiyoruz

        System.out.println(str.substring(str.length()-5)); // siyor   yazar..
        System.out.println(str.substring(str.length())); // son harften sonrki kısmi yani hiçlik verir

    }

}
