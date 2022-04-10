package day34_accessModifier_encapsulation;

public class C02_AccessModifier {
    public static void main(String[] args) {

        C01 obj = new C01(); // C01 clasına erişmek için obje oluşturduk

      obj.acikString="bye"; // obje sayesinde private olmayan a ulaşılabilir.

      C01.acikSayi=50;

      // C01.sayi = 15 ; private access modifier'i oldugundan başka class dan erişilemez.

        //obj.method1; private access modifie'i
        // oldugundan başka class dan erişilemez

     //   C01 objParametreli = new C01(5); C01 daki parametreli cons. private yazmadan clışıtyordu ama
                                             // private olursa kimse uşasışamıyor.
    }
}
