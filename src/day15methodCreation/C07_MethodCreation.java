package day15methodCreation;

public class C07_MethodCreation {

    public static void main(String[] args) {




        // String i yazdıran method olusturualım

        // hos geldiniz diyen bir method olusturun

        // kapanma mesajı yazan bir method olusturalım

        hosgeldinYazdir();
        stringYazdir("Java gin gectikce guzellesiyor");
        kapanmaMethodu();

    }

    private static void kapanmaMethodu() {
        System.out.println("Kapanma");
    }

    public static void hosgeldinYazdir() {
        System.out.println("Hos geldiniz");

    }

    private static void stringYazdir(String str) {

        System.out.println(str);
    }
}
