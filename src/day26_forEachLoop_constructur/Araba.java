package day26_forEachLoop_constructur;

public class Araba {
        /* Java da her klass olusturdugumuzda Java o classdan ileride objeler uretmek gerekecegini bilir

        ve biz ozellikle belirtmesek de Java her olsturdugu klass a Construktor koyar.

        Javanın class olustururken class a koydugu construcktor a DEFAULT CONSTRUCKTOR denir ve gorulmez.

        Eger biz gorunur bir construcktor olsun istersek defaolt consturktor ile
        aynı gorevi yapan bir construcktor olusturabilirz
        veya istersek aynı kalıptan farklı desenlerde objeler olusturmak icin
        farklı ozelliklerde construcklar da oluşturabiliriz

        construckları birbirinden farklılaştıran tek ayrıcalık
        kullanlılan parametre sayısı ve parametre data turudur.


 */

    public Araba() {
        System.out.println("parametresiz constructor calıstı");
    }
    // bir kod blogunun method yada constractor olmasından emin olması istiyorsanız
    // iki seye dikkat ektmekisizi

    //1)  constractorların ismi class ismi ile aynı olmak ZORUNDADI  yani buyuk harfle baslar
    //2) Constracktor ların retorn type ı olmaz.

    // ozetle constractor ın adı class adı ile aynı olmalı ve
    // retorn type ı olmamalı.

    public Araba(String renk) {
        System.out.println(renk + "Renkli bir araba uretildi");
    }

    public Araba(int yil) {
        System.out.println(yil + "yıl  model araba uretildi");
    }

    public Araba(int yil, String renk) {
        System.out.println(yil + "yıl  model" + renk + " renkli araba uretildi");

    }
}
