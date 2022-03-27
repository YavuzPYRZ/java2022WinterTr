package day17_forLoop;

public class C13_PalindromeTekBasıma {
    public static void main(String[] args) {

        kelimeTersiIleAyniMi();
    }

    public static void kelimeTersiIleAyniMi() {

        String kelimeninTersi="";
        String input="ey edip adanada pide ye";

        for (int i =input.length()-1; i >=0 ; i--) {
            kelimeninTersi+=input.charAt(i);

        } System.out.println(kelimeninTersi);

        if (input.equalsIgnoreCase(kelimeninTersi)){
            System.out.println("Kelime palidrome");

        }else {
            System.out.println("Kelime malesef ki palidrome degil");
        }
    }
}
