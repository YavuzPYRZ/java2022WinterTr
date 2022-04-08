package day39_overriding;

public class Corolla extends Toyota{
    protected String hız ="Corolla max 200 km hız yapar";
    protected String yakıt ="corolla benzinli veya elektriklidir";
protected String model ="Corolla";

    public void motor(){

        System.out.println("Corolla araçlar çevreci motor kullanır");
    }

    public void yakitTuketimi(){
        System.out.println("Corolla 5,6 lt yakıt tuketir");
    }

    public void vitesSayisi(){

        System.out.println("corolla 5 viteslidir");
    }

    public static void main(String[] args) {
        /*
        Data turu ve constuctor farklı oldugunda
         cons. calıstıho için obje
         Construcktor'in oldugu class ocellikleri
         tasır ancak Data turu Parent class
          secildigi icin veriable ler
           data turu secildigi class ve
          onun parent claslarıdan deger alabilir

          Methodlar için ise yine Data turunun
          oldugu class a gideriz
          ancak direk method u calıştırmadan onca
          method Override edilmiş mi deye kontrol ederiz.
         */
        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket); // araba
        System.out.println(arb1.hız); // Corolla
        System.out.println(arb1.yakıt); // Corolla
        System.out.println(arb1.marka); // toyota
        System.out.println(arb1.sirketMerkezi);//Toyota
        System.out.println(arb1.model); // corolla
arb1.motor();// Corolla

        Toyota arb2 = new Corolla();
        System.out.println(arb2.hareket); // araba
        System.out.println(arb2.hız); // Toyata

        System.out.println(arb2.yakıt); // araba

        System.out.println(arb2.marka); // toyota
        System.out.println(arb2.sirketMerkezi); //toyota
      //  System.out.println(arb2.model); // CTE
        arb2.motor();


        Araba arb3 = new Corolla();
        System.out.println(arb3.hareket); // Araba
        System.out.println(arb3.hız); // Araba
        System.out.println(arb3.yakıt); // Araba
        System.out.println(arb3.marka); // Araba
       // System.out.println(arb3.sirketMerkezi);//CTE
       // System.out.println(arb3.model); // CTE


    }
}
