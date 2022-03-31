package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasınıBulma {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();

        LocalDate dogumGunu = LocalDate.of(1988,6,9);

        System.out.println(Period.between(dogumGunu,bugun)); // P33Y9M22D

        System.out.println(Period.between(dogumGunu,bugun).getYears()); // kaç yaşındasın 33

        // FIXME: 31.03.2022
        // sout yazar gibi fixm.. yazınca direk yorum olarak tarihi yazdırır.
    }
}
