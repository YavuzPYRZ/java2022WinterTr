package day14_stringManipulation;

public class C06_Tekrar_String_Sayi_Toplama {
    public static void main(String[] args) {



       /* str1=str1.replaceAll("\\D", "");
        str2=str2.replaceAll("\\D", "");



        double yeniSayi1=Double.valueOf(str1);
        double yeniSayi2=Double.valueOf(str2);

        System.out.println("Rakamlar toplamı : $"+ (yeniSayi1+yeniSayi2)/100);
*/
        String str1="$13.99";
        String str2="$10.55";

        String str1Sayi=str1.replaceAll("\\D","");
        String str2Sayi=str2.replaceAll("\\D","");

        double sayi1dooble=Double.valueOf(str1Sayi);
        double sayi2dooble=Double.valueOf(str2Sayi);

        double sonuc=(sayi1dooble+sayi2dooble)/100;

        System.out.println("Verilen String Sayilarının Toplamı "+ sonuc);

















    }
}
