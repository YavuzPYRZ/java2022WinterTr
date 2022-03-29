package day30_passByValue;

public class C02_StaticBlocks {
    {// statik olmayan blocklar ise obje olusturulurken çalışır.

        // statik blocklar sadece 1 kez en başta çalışir.
        // Ama statik olmayan blocklar her obje olşturulurken yeniden çalışir.

        System.out.println("Statik olmayan block çalıştı");   // Statik olmayan block oldu
    }
  //   System.out.println("Statik olmayan block çalıştı");// bunu kabul etmez.

    static {
        System.out.println("static bloc calıştı");
    }

    public static void main(String[] args) {
        System.out.println("Main method başı");
        C02_StaticBlocks obj1 = new C02_StaticBlocks();
        C02_StaticBlocks obj2 = new C02_StaticBlocks();
    }
}
