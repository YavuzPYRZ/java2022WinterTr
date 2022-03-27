package day24_List;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar =new ArrayList<>();
        sayilar.add(5); // [5]
        sayilar.add(3); // [5,3]
        sayilar.add(0,7); // [7,5,3]
        sayilar.add(2,7);// [7,5,7,3]

        sayilar.remove(3); // index olarak 3 deki elementi siler
       // sayilar.remove(5); // IndexOutOfBoundsException
        // sayilardan olusam bir List de objeyi vererek element silme method'u çalışmaz
        // sayı degeri girdigimizde Java otamatik olarak sayiyi index kabul eder.

       // int sayi=5;

       // sayilar.remove(sayi); // IndexOutOfBoundsException cunki remove içine index alır index 5 yokk dedi

        Integer sayi =5; // bunu kabul etti // Integer Wrepper class ı kullanınca sayi obje oldugundan çalıştı

        sayilar.remove(sayi);
        System.out.println(sayilar); // [7, 7] once 3 u kadırdı sonra 5 i kaldırdı son kalan bu.

    }
}
