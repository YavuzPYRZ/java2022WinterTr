package day34_accessModifier_encapsulation;

public class C02_AccessModifier {
    public static void main(String[] args) {

        C01 obj = new C01();

      obj.acikString="bye";

      C01.acikSayi=50;

      // C01.sayi = 15 ; private access modifier'i oldugundan
        // başka class dan erişilemez.

        //obj.method1; private access modifie'i
        // oldugundan başla calsdan erişilemez
    }
}
