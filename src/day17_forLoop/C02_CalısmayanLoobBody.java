package day17_forLoop;

public class C02_CalısmayanLoobBody {
    public static void main(String[] args) {
        //
        // i nin baslangıc degeri 0 baslamaz(false) loop hemen baslamadan kırıldı
        // kod calısmadı

        // false gordugu anda for bitecekti. başlamadan bitti.
        for (int i = 0; i >10 ; i++) {

        }
        System.out.println("Baslangıc degeri bitis kosulunu saglamadıgından " +
                "loop body'si hic calısamadan loop sona erdi");
    }
}
