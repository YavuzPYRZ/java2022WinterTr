package day05_matematikselIslemler;

public class C05_WrepperClass {
    public static void main(String[] args) {
        short sayi1=20;
        Short sayi2=30;

        sayi1=sayi2;// Wrepper Class ile aynı isimdeki primitive arasında geçiş olabilir.

        System.out.println(sayi1);
        System.out.println(Short.MAX_VALUE);//32767

        System.out.println(Short.MIN_VALUE);//-32768

        System.out.println(Short.BYTES); //2 Byte = 16 bit





    }
}
