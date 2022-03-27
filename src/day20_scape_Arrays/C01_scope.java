package day20_scape_Arrays;

public class C01_scope {

    int sayi;
    String bransIsmi="Java";
    boolean okuldaMi;

    public static void main(String[] args) {
        // sayi=10; sayi veriableyi static olmdığı icin main method dan direk kullanılamaz
        //instance veriablelere static method lardan ulasabilmek icin obje olustumamız gerekir.

        C01_scope obj1= new C01_scope();
        System.out.println(obj1.sayi); // 0 yazar

        obj1.sayi=10; // burası kabul etti obj ye ait sayiyi degistirdi
        System.out.println(obj1.sayi); // objeye ait birşey istedik nerede olustu oradan itibaren bakar.


        obj1.bransIsmi="SQL";
        System.out.println(obj1.okuldaMi);// atama burada yapılmadıyda Java bizi class level a goturu.
        // class level da deger atanmamıs. bu nedenle defold deger boolean için ***false*** olur

        C01_scope obj2= new C01_scope();
        System.out.println(obj2.sayi);// class degerine bakar deger yok defold degeri 0 yazdırır
        System.out.println(obj2.bransIsmi); // C01 de olusturulan obj de brans ismi degişti mi yok
                                            // o zaman ust katmana geçer ve Java yazdırı


        // obj1 de okuldaMı degısırse bu obj1 i baglamaz

    }
}
