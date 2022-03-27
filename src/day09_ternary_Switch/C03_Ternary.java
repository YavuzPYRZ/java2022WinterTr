package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi=1400;
        //verilen syının 3 veya daha cok basamaklı olup olmadığını kontrol eden
        // ve sonucu yazdıran bir ternary olusturun

        String sonuc=sayi>=100 ? "sayı 3 basamaklı veya daha buyuk" : "sayı negarif yada 3 basamaktan kucuk";

        // ternary bize sonuç dondurdugu icin ya bu sonucu direk yazdırmalıyoz yada
        // sonucun data turune uygun bir variable a atayabiliriz.

        System.out.println("Girdiginiz sayı analızi : "+sonuc);

    }
}
