package day30_passByValue;

public class C05_PassByValue {

        public static void main(String[] args) {
            double etiketFiyati=100;
            double indirimYuzdesi=10;

           etiketFiyati= kaliciIndirimYap(etiketFiyati,indirimYuzdesi);
            System.out.println("main method da indirim sonrası etiket fiyatı : " + etiketFiyati);
                                            // main method da indirim sonrası etiket fiyatı : 90.0
        }


    public static double kaliciIndirimYap(double etiketFiyati , double indirimYuzdesi) {

        etiketFiyati = etiketFiyati*(100-indirimYuzdesi)/100;

        System.out.println("indirimli fiyat :" + etiketFiyati); // indirimli fiyat :90.0
        return etiketFiyati;
    }

}
