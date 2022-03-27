package day13_stringManipulation;

public class C02_substring {
    public static void main(String[] args) {
        // 1-48 of 104 results for "nutelle"
        // bu arama sunucundaki bulunan sonuc sayısı 100'de cık ise super
        // az ise "az sonuc bulunde"

        String str="1-48 of 104 results for \"nutelle\"";

        int ilkSpace= str.indexOf(" "); // ilk space nin index i verece yukarıdaki yazı için 4 verecek

        int ikinciSpace = str.indexOf(" ", ilkSpace+1);

        int ucuncuSpace = str.indexOf(" ",ikinciSpace+1);

        String aramaSonucSayisiStr = str.substring(ikinciSpace+1,ucuncuSpace);

        System.out.println(aramaSonucSayisiStr);// 104 ama burada String olarak yazıyor

        int aramaSonucSayisiInt =Integer.valueOf(aramaSonucSayisiStr);//  104 // artık bu int


        if (aramaSonucSayisiInt>100){
            System.out.println("Süper");

        } else {
            System.out.println("az sonuc bulunde");
        }

    }
}
