package day33_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {

 //  kaç tane string verilirse verilsin  içlerinden en uzun olanı yazdıran bir method olşturun

    String str1 = "Ali";
    String str2 = "Veli";
    String str3 = "Oguzhan";

   //  yazılan sayısı sabitse herzamnki gibi bir method oluşturabiliriz
    // ancak argumant sayısı degışme ihtimali varsa o zaman varargs tercih edilir

  //   enUzunKelime(str1,str2); // Veli
        enUzunKelime(str1,str2,str3);//  Oguzhan
}

    private static void enUzunKelime(String... str) {
        String enUzunStr = "";
        for (String each: str
             ) {
            if (each.length()>enUzunStr.length()){ // gelen kelime en uzundan daha uzunsa
                enUzunStr=each; // en uzun kelime benimki olsun

            }
        }
        System.out.println("En uzun kelime : " + enUzunStr);

    }
}