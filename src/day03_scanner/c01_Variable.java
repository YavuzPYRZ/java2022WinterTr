package day03_scanner;

public class c01_Variable {

    public static void main(String[] args) {

        String okulIsmi="Yildiz Koleji";


        okulIsmi="Java Koleji";
        System.out.println(okulIsmi);

        char ilkHarf;
        ilkHarf='A';
        System.out.println(ilkHarf);

        int sayi1=10, sayı2=20;
        System.out.println(sayi1+sayı2);
        System.out.println(sayi1*sayı2);

        String ısım="Elif";
        String soyIsım="Yıldız";

        System.out.println("Isminiz : " + ısım);
        System.out.println("Soyisminiz : "+soyIsım);

        short sayı3=20;
        double sayı4=30;

        System.out.println("ıkı sayının toplamı: "+(sayı3+sayı4));


        int sayı5=20;
        char harf='a'; //char data türündeki değişlenler matematiksel olarak kullanılırsa
        // o askıı
        // değerindeki matematiksel rakamı alınır

        System.out.println(sayı5+harf);





    }
}
