package day03_scanner;

public class C02_SwapVariables {
    public static void main(String[] args) {
        /*Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
 Orn  : sayi1=10 ve sayi2=20;
  kod calistiktan sonra
  sayi1=20 ve sayi2=10*/

        int sayı1=10;
        int sayı2=20;

        System.out.println("swap dan once sayı1: "+ sayı1 +", sayı 2 : "+ sayı2);

        int temp=sayı1;
        sayı1=sayı2;
        sayı2=temp;
        System.out.println("swap dan sonra sayı1: "+ sayı1 +", sayı 2 : "+ sayı2);

    }

    public static class C3_SwapVariablesOdev {

        public static void main(String[] args) {
            int sayi1=10;
            int sayi2=50;

            sayi1=sayi2+sayi1; //sayi 1 60 oldu
            sayi2=sayi1-sayi2; // sayi 2 =10 olsu
            sayi1=sayi1-sayi2;

            System.out.println("swap dan sonra sayi 1= "+sayi1+"    sayi 2= "+sayi2);
        }
    }
}
