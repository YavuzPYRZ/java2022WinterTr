package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
    int sayi1=879;
    double sayi2=10;

    double sayi3=sayi1/sayi2;// once sayi1/sayi2 yapacak otomatikmen buyuk olaca cevirecek yanı burada dooble'a
                            // sayi3 zaten dooble oldugundan sorunsuz calisir. socuc ==> 87,9
        System.out.println(sayi3);

       // int sayi4=sayi1/sayi2; // Java bu haliyle kabul etmiuyor cunku sayi1/sayi2 dooble oluyor.
                                // sayı 4 e biz int dedik yanı dooble den dar(kucuk) bir yapı.
        int sayi4=(int) (sayi1/sayi2); //87,9 int olmayacagı icin sorumlulugu ustlenmemız lazım

        System.out.println(sayi4);// 87 oldu. cunku  (sayi1/sayi2) dooble oluyordu ama basına (int) yazarak
                                    // cıkan sonucu int yap veri kaycı kabulum dedik...
    }
}
