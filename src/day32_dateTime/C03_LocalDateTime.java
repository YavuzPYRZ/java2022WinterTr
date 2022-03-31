package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat);
        //2022-03-31T21:35:35.417372900 ( T den sonrası Time diyor) hem tatihi hem saati verir

        System.out.println(tarihSaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5));
        // 3 yil 2 ay 10 gun 5 saat 5 dk sonra 2025-06-11T02:42:36.636416300 olacak


    }
}
