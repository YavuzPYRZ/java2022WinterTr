package day12_stringManipulation;
                                        // baaaaakkkkk------
public class C02_lastIndexOf {
    public static void main(String[] args) {
                /*
        Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        - Girilen kelime cumlede kullanilmamis.
        - Girilen kelime cumlede 1 kere kullanilmis.
        - Girilen kelime cumlede 1’den fazla kullanilmis.
         */

        String cumle = "Java ogren,yeni program ile yeni bir sayfa ac";
        String kelime="yeni";

        int ilkKullanım=cumle.indexOf(kelime); // ya -1 veya index
        int sonkullanım=cumle.lastIndexOf(kelime);

        if (ilkKullanım==(-1)){
            System.out.println("Girilen kelime cumlede kullanılmamıştır");
        } else if (ilkKullanım==sonkullanım){
            System.out.println("Girilen kelime cumlede 1 kez kullanılmamıştır");

        }else {
            System.out.println("Girilen kelime cumlede 1 den fazla kullanılmıştır");
        }
    }
}
