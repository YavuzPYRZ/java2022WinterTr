package day33_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        // parametre olarak bir integer
        //ve istedigimiz kadar string alan en uzun kelimenin har sayısı ile
        // int parametre degerini çarpıp sonucu yazdıran bir method oluşturun.

        int sayi=5;

        String str1="Zulel";
        String str2="Zeynep"; // str ler artabilir...
        String str3="Ali";

        carpim(sayi,str1,str2,str3);

    }

    private static void carpim(int sayi, String... str) {
        String enUzunStr = "";
        for (String each: str
        ) {
            if (each.length()>enUzunStr.length()){ // gelen kelime en uzundan daha uzunsa
                enUzunStr=each; // en uzun kelime benimki olsun

            }
        }

        System.out.println("istenen deger : " + sayi*enUzunStr.length()); // 5*6 = 30 olur

    }
}
