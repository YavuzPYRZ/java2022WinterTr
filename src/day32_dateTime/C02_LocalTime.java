package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm = LocalTime.now();
        System.out.println(tm); // 21:09:46.973318900

        int sayi =0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;

        }
        System.out.println(sayi); // 704982704
        System.out.println(tm); // 21:12:35.719179900  objeyi olusturdugumuz andaki degeri alır.

        // 21:15:32.522834
        // bitirince yeni bir obje oluşturmam gerkli
        LocalTime tmLoopSonrasi = LocalTime.now();
        System.out.println(tmLoopSonrasi); // 21:15:32.535826200


//   --------- nano muhabbetine bak...-----

        double nano1 = tm.getNano(); // 21:19:59.688692800
        double nano2 = tmLoopSonrasi.getNano(); // 21:19:59.703684200

        // bir işlemin ne kadar sürede bittigini bulmak için
        // aradaki farkı hesaplayabilirsiniz

        // ileriye geriye gidebiliriz
        System.out.println(tm.plusMinutes(1000)); // 1000 dk sonra saat kaç olacak 13:59:59.688692800 olacakmış

        // istersek zoneId kullanarak istedigimiz bolgenin saati icin de obje oluşturabiliriz.

    }
}
