package day38_inheritance_overriding;

public class Ustabasi extends Isci{

    String statu = "Ustabasi";
    String haklar = "Ustabası haftada 1 gun extra tatil hakkına sahiptir";

    public void mesai(){
        System.out.println("Arıza varsa Ustabası extra ucret almadan calışır");
    }
    public void maasHesapla(){
        System.out.println("Ustabası 30 gun * 8 saat * 12 euro = " + (30*8*12)+ "Euro kazanır");

    }

    public static void main(String[] args) {

        Ustabasi yasin = new Ustabasi();

        System.out.println(yasin.statu); // Ustabası
        System.out.println(yasin.haklar); // Ustabası haftada 1 gun extra tatil hakkına sahiptir
        // clasık olarak obje olusturursak (yasın) o obje içine bakar once
        //  bu class da bunlar (statu-haklar) tanımlanmı. Ecde tuz var:)

        // eger yoksa ust claslara bakar
        System.out.println(yasin.ikramiye); //Ustabası haftada 1 gun extra tatil hakkına sahiptir
        System.out.println(yasin.izin); // Tüm personele yılda 4 hafta izin var

        // eger isci olarak ozellikleri gormek istersek
        // Class adını (Data turunu) Isci seceriz
        Isci ahmet = new Ustabasi();

        System.out.println(ahmet.statu); // isci
        System.out.println(ahmet.haklar); // Ustabası haftada 1 gun extra tatil hakkına sahiptir
        System.out.println(ahmet.ikramiye); //isciler yilsa 1 ikramiye alır.
        System.out.println(ahmet.izin); // Tüm personele yılda 4 hafta izin var


        Personel adem = new Ustabasi();
        System.out.println(adem.statu); // Personel
        System.out.println(adem.haklar); // Tüm personel esit haklara sahiptir
       //  System.out.println(adem.ikramiye); //Kişiyi personel tanımladık ama alt class daki ikramiyeye ulaşmaya calısıyoruz
                                             // geri vites yok  alt class da tanımlanan seyi bulamaz...CTE verir
        System.out.println(adem.izin); // Tüm personele yılda 4 hafta izin var

        /*
        Personel adem = new Ustabası();  Bu bir Ustabaşı objesidir
        Personel adem = new Personel(); Bu Personel objesidir.

        bu farkı overreiding de anlatılacak
         */

        /*
           Personel adem = new Ustabası()

           Adem in data turu Personel'dir
           boylece biz adem'i ne olarak isimlendirdigimizi bilebilriz
           Ancak ben adem in ustabası oldugunu biliyoruz.
           cunku constructor ı Ustabası

           Ama bu yazımm formatı ile adem in tum Personel ile birlikte
           sahip oldugu ortak ozellikleri vurgulamak isyiyorum

           Bu kullanım seklinde olusturulan obje data turu olarak secilen class ve  onun parent claslarındaki
           veriable leri kullanabilir
        */
    }
}
