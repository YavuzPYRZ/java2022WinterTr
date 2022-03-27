package day04_dataCasting_Increment;

public class C05_IncreamentDecrement {
    public static void main(String[] args) {
        int sayi = 20;

        System.out.println(sayi+10); // 30
        System.out.println(sayi); // 20
                                // sayiyi uste arttırdık ama atama yapmadık o yuzden yine sayi 20 kaldı
                                // burada sayının 10 falasını yazdır dedik sadece

        sayi = sayi+10;
        System.out.println(sayi); // burada sayıyı arttırır ve yazdırırız.30 oldu artık
        System.out.println(sayi=sayi+10); // hem 10 arttırdık hem atadık hem yazdırdık
        System.out.println(sayi); // 40 uste en son 40 olmustu o haliyle yazdırdı

        System.out.println(sayi+=10); // 50 hem arttırdı hem atadı hem yazdırdı

        System.out.println("19. Satır " + sayi++);// 50 olur once sayıyı  yazdırdı sonra sayı yı arttırdı (++) sagda
        System.out.println("20. Satır "+sayi); // 51 olacak. uste sayı arttırılmıs tı...

        System.out.println("22. satır "+ ++sayi); // 52 olacak cunku ++ solda
        System.out.println("23. satır "+ sayi); // 52
    }
}
