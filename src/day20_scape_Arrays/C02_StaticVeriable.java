package day20_scape_Arrays;

public class C02_StaticVeriable {
// instans verianle lar obje ye bagımlıdır ve her obje farklı degerler alabililir.
    // ogrenci notları ya da ogretmen branşları gibi diyebiliriz
    // bir objeye ait bir veriable in son degerini bulmak icin sadece o objey dikkate alırız

    // Static veriable ler ise class verianle olarak tanımlanır
    // ve tum class uyeleri icin aynıdır. okul simz olul muduru adı gibi
    // eger static veriable in deteri degiştirilirse degisir

    static String okulIsmi="Yıldız Koleji";
    static int okulNo;
    static boolean okulAcikMı;


    public static void main(String[] args) {

        System.out.println(okulIsmi); // main method static cagırdığımız da statik kein problem Yildız Koleji yazdırır
        System.out.println(okulNo); // defolt olan 0 yazar
        okulNo=102;
        System.out.println(okulNo); // 102
        System.out.println(okulAcikMı); // false (defoult)

        staticMethod();
        System.out.println("20. Satir "+okulNo); // 200    ----25. satıdan sonra yazdırır.----
    }

    public static void staticMethod(){
        okulNo=200;
        System.out.println("25. Satır"+ okulNo); // robotun calışması icin getimek gerek
                                    // once main method da methodun adını yazmak gerekiyor



    }

}
