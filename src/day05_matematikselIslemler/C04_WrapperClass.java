package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        //primirive data türü ile n.p. data türü arasındakı farklar nelerdir?
        String str = "Java";

        int sayi =10;
        System.out.println(str.toUpperCase()); // JAVA

        // non.primitive data türleri data depolamak yanınd birçok faydalı methoda sahiptir
        //ancak primitiv data türlerinin boyle bir ozelliği yoktur.
        // primitive data türleri sadece değerler saklar (container)

        //primitive data türleri için de bazı methotlar gerekli olduğunda ara çüzüm üretmiş.
        //Java her bir primitie data türünü  non-primitive olarak kullanabilmek için
        // özel klaskat oluşturmus bunlar Wrepper Class adını vermişş.

        double sayi2=20.5;
        //sayi2 primitiv olduğundan sayi2. dediğimizde hiçbir methot gelmez.

        Double sayi3=15.2;
        // sayi3 wrepper Class olan Double clası kullandığından
        // sayi3. dediğiizde birçok methot gelir.




    }
}
