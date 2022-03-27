package day13_stringManipulation;

public class C03_Cte_Rte {
    public static void main(String[] args) {

        //   int sayi = "Ali can"; // syntax hatalarını Java yazdıgımızd gorur ve altını cızer
                                // tüm projede altı cizili bir kod varsa proje de hicbir class calısmaz
    String str = "Javada hersey zamanla oturur";

        System.out.println(str.substring(5000)); // buradaki hatayı calışınca anladı
    }
}
