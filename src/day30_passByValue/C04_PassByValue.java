package day30_passByValue;

public class C04_PassByValue {
// degerleri class deviyesinde olusturulursa.. deger sabit kalmaz...
// cunkü her deger degiştiginde deger kalıcı olarak degişir.
        static double etiketFiyati;
        static double indirimYuzdesi;

    public static void main(String[] args) {
        etiketFiyati=100;
        indirimYuzdesi=10;

        kaliciIndirimYap(); // indirimli fiyat :90.0
        kaliciIndirimYap(); // indirimli fiyat :81.0
        kaliciIndirimYap(); // indirimli fiyat :72.9
        kaliciIndirimYap(); // indirimli fiyat :65.61000000000001
    }

    public static void kaliciIndirimYap() {
        etiketFiyati = etiketFiyati*(100-indirimYuzdesi)/100;

        System.out.println("indirimli fiyat :" + etiketFiyati);
    }
}
