package day34_accessModifier_encapsulation;

public class C01 {
    private static int sayi = 10;
    private static String str = "Java";

    static  int acikSayi=20;
    public static int halkaAcikSayi=15;
    String acikString = "Hi";
    C01(){ // bir construroctur oluşturduk
            // dolayısıl-yla içinde olsugumuz classın dışındn
        // obje bile oluşturulamaz.
    }
private void method(){ // private bir method oluşturduk
                        // buna başka yerden ulaşılamaz.

}
  private   C01(int numara){ // acık parametreli default bir const. oluşstururalım.
        System.out.println("parametreli cons. calıştı.");
    }

}
