package day36_inheritance;

public class Memur extends Muhasebe{


    public static void main(String[] args) {


    
    Memur memur1 = new Memur();
    // memur1 objesi Memur class'ının olmasına ragmen 
    // inherit ettigi Muhasebe ve onun da Parent'i olan Personal clasındaki her datayı kullanabilir

        //personel class'ından
        memur1.persNo = 1001;
        memur1.isim="Ahmet";
        memur1.soyisim ="Tepecik";
        memur1.adres = "Ankara";
        memur1.tel = "3125756595";

        // muhasebe class'ından
        memur1.saatUcreti = 10;
        memur1.maas= memur1.maasHesapla();
        memur1.statu="Memur";
        System.out.println(memur1); //Memur{saatUcreti=10, statu='Memur', maas=2400, persNo=1001,
        // isim='Ahmet', soyisim='Tepecik', adres='Ankara', tel='3125756595'}



        Memur memur2= new Memur();
        memur2.persNo=1002;
        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();
        System.out.println(memur2); // Memur{saatUcreti=10, statu='null', maas=2400, persNo=1002,
                                 // isim='null', soyisim='null', adres='null', tel='null'}

        // atama yapılmayanlar default degeri alır.





      }

    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
