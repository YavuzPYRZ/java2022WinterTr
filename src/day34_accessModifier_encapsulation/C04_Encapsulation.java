package day34_accessModifier_encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {
        C03 obj = new C03();
      //  obj.sayi.... yapılamaz cunku C03 deki sayi private

        System.out.println(obj.getSayi()); // 0 (default degeri)

        obj.setStr("Java Java Java");
        System.out.println(obj.getStr()); //Java Java Java
    }
}
