package day32_dateTime;

public class C06_Varargs {
    public static void main(String[] args) {
        int sayi1 = 10 ;
        int sayi2 = 20 ;
        int sayi3 = 30;
        int sayi4 = 40 ;
        int sayi5 = 50 ;
        int sayi6 = 60;


        toplagel();
        toplagel(sayi1);
        toplagel(sayi1,sayi2);
        toplagel(sayi1,sayi2,sayi3);
        toplagel(sayi1,sayi2,sayi3,sayi4);
        toplagel(sayi1,sayi2,sayi3,sayi4,sayi5);

    }

    private static void toplagel(int... sayi) {
        int toplam = 0;
        for (int each: sayi
             ) {
            toplam+=each;
        }
        System.out.println(toplam);
       /* 10
        30
        60
        100
        150
*/

    }

}
