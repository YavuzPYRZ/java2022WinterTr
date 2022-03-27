package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {


        String input ="madam";

        palindromeKontrolEt(input);


    }

    private static void palindromeKontrolEt(String input) { // void olunca birşey dondurmesine gerek yok
                                                        //isini yapsın(burada yazdırmask olacak) yeter
        String terstenInput="";

        for (int i = input.length()-1; i >=0 ; i--) {

            terstenInput+=input.charAt(i);

        }
        System.out.println("girdiginiz kelimenin testen yazılısı : "+terstenInput);

        if (input.equalsIgnoreCase(terstenInput)){
            System.out.println("girdiginiz kelime palindrom");
        }else {
            System.out.println("girdiginiz kelime palindrome degil");
        }
    }


}
