package day26_forEachLoop_constructur;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        int arr [] = {2,4,6,8,11};
        // elementleri forloop ile yazdıralaım

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

        // bunu for-each loop ile yapacak olursak
        // for-each loop u calıştırmak icin bir collection vermeliyiz

        for (int each :arr // hengi data turu , getirilenlere ne ad veriyoruz genel olarak, nereden getireyim
             ) {
            System.out.print(each + " "); // GENELDE index e gore getirir. bazen farklı olur
        }

        // AVANTAJI: index baslangıc degeri bitis degeri gibi detaylarla usgrasmamıza gerek kalmadan
        // collections dan tüm elementleri bize getirir

        // DEZAVANTAJI ı ise index e baglı bir islem yapamayız
    }
}
