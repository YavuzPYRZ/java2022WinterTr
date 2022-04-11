package day35_inheritance;

public class Isci extends Personel{
    public static void main(String[] args) {
Personel objPers =new Personel();
    objPers.isim = "eren";
    objPers.soyisim = "Terzi";
    objPers.adres ="berlin";
    // burada ben işci oluşturmadım. bir personel ürettim.
        // personel den birşeyleri cagırıp hep onunla işlem yaptım.

       //  şimdi bir işci oluşturayım. ama bunun bazı ozellikleri
       // de personel den geldin.. Fabrika adı gibi...
       Isci objIsci = new Isci(); // bir işci oluşturdum..

        objIsci.isim = "huseyin";
        objIsci.soyisim = "Efe";
        objIsci.adres = "Ankara"; // işcinin bilgilerini guncelledik.



    }
}
