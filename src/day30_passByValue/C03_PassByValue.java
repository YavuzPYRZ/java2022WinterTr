package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {


    double etiketFiyatı = 100;

    yuzdeOnIndirimYap(etiketFiyatı); //Sizin için %10 indirimli fiyatımız :90.0
    yuzdeOnIndirimYap(etiketFiyatı); // Sizin için %10 indirimli fiyatımız :90.0
        System.out.println("2 indirimden sonra main method'da etiket fiyatı : "+ etiketFiyatı);
                                                            //2 indirimden sonra main method'da etiket fiyatı : 100.0

}

    public static void yuzdeOnIndirimYap(double etiketFiyatı) {
        etiketFiyatı*=0.90;

        System.out.println("Sizin için %10 indirimli fiyatımız :" + etiketFiyatı);
    }
}


