package day27_costructor;

public class ToyotaRunner {
    public static void main(String[] args) {
        Toyota t1 = new Toyota(); // bana bir obje olusturdu
                            // Toyoto() parametresi constrakter olusturduk

        System.out.println(t1.marka); // Toyota
        // gitti parametresiz varmı baktı yok gitti default degerleri aldı.

        System.out.println(t1.tekerAdedi); // 4
        System.out.println(t1.model); // String için default deger null'u getirdi

        t1.model="Corolla";
        t1.yakit = "Benzin";
        t1.yil = 2022;

        System.out.println("t1 model: " + t1.model + ", yakıt : "+ t1.yakit); // t1 model: Corolla, yakıt : Benzin

        Toyota t2 = new Toyota();
        System.out.println(t2.model); // null
        t2.model="Yaris";
        t2.yakit = "Benzin";
        t2.yil = 2021;
        System.out.println("t2 model: " + t2.model + ", yakıt : "+ t2.yakit); //t2 model: Yaris, yakıt : Benzin

        //
    }
}
