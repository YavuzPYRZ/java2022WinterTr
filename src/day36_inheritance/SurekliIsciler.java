package day36_inheritance;

public class SurekliIsciler extends Isci{

    @Override
    public String toString() {
        return "SurekliIsciler{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {

        SurekliIsciler surIc1 = new SurekliIsciler();
        surIc1.persNo=5001;
        surIc1.isim = "Cem";
        surIc1.soyisim = "Akay";
        surIc1.statu = "Isci";
        surIc1.saatUcreti = 11;
        surIc1.maas = surIc1.maasHesapla();

        System.out.println(surIc1); //SurekliIsciler{isciStatu='Surekli Isci', saatUcreti=11, statu='Isci', maas=2640,
                        // persNo=5001, isim='Cem', soyisim='Akay', adres='Adres Girilmedi', tel='Telefon girilmedi'}

    }


}
