package day34_accessModifier_encapsulation;

public class C03 {

        // encapsule edecegimiz 2 veriable olsun.
         private int sayi;
         private String str;

    public int getSayi() { // sayı ya sadece ulaşılabilir
        // ama deger ataması yapılamaz. cunku setter ı kaldırdık
        return sayi;
    }

    /*public void setSayi(int sayi) {
        this.sayi = sayi;
    }burayı silersek sayi okunur ama yazılamaz.
    */

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
