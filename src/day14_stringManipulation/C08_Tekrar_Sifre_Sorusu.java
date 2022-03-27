package day14_stringManipulation;

public class C08_Tekrar_Sifre_Sorusu {
    public static void main(String[] args) {
        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali

        String sifre="Asdf1234a";
        boolean ilkHarf= false;
        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            ilkHarf=true;

        }else{
            System.out.println("İlk harf Büyük Olmalı");
        }


        boolean sonHarf= false;
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='a'){
            sonHarf=true;

        }else{
            System.out.println("son harf kucuk Olmalı");
        }

        boolean bosluk= false;
        if (!sifre.contains(" ")){
            bosluk=true;

        }else{
            System.out.println("Boşluk olmamalı");
        }


        boolean uzunluk= false;
        if (sifre.length()-1>=8){
            uzunluk=true;

        }else{
            System.out.println("sifreniz 8 karakterden buyuk olmalı");
        }

        if (ilkHarf&&sonHarf&&uzunluk&&bosluk){

            System.out.println("Sifreniz basarıyla kaydedildi");
        }


    }
}
