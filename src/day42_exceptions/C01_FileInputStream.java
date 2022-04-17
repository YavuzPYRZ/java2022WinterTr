package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {
        String dosyaYolu = "day41_exceptions/dosya.txt";


        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            int k=0;
            while ((k=fis.read()) != -1){
                System.out.println((char) k);
            }
        } catch (FileNotFoundException e) { // FileNotFoundException e

            e.printStackTrace();
        } catch (IOException e) { // IOException e
            e.printStackTrace();
        }

        /*
        Exception lar icind e parent child işişkis, mevcuttur.
        Eger bir kod için birden fazla exceptoon olusma ihtimali varsa oncelikle
        olası wxceptionlar parent child ilişkisi tasoyor mu bakmak gerekir
        eger p-c ilişkisi yokda istediğimiz sırada carch cunleleri olusturabiliriz.
         */
        /*

        altı kırmızı cizgili her kod CTE degildir
        Java syntax hatalarını derleme esnasında (compile) farkeder ve altını cizer
        biz bu gune kadar tamamına CTE diorduk ancak
        exeption Tine
         */
    }
}
