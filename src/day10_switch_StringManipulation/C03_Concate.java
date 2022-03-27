package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Candır";
        // java candır yazdır
        System.out.println(str1+" "+str2);

        String cumle =str1.concat(str2); // str1 yazdıracak sonra str2 yi concet edecek yanı yapıstıracak

        cumle= str1.concat(" ").concat(str2);

        System.out.println(cumle);

        // concet içine String değılde sayı veya boole deger yazsak
        //  cumle=str1.concat(5); olmaz.. String dışı kabul etmez
        //  Yada String haline getirmelisinz "" hiçlik ile olabilr mesela

    }
}
