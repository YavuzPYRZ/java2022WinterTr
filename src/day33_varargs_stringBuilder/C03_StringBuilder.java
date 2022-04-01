package day33_varargs_stringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(); // standart başta 16 karakter ayırır
        StringBuilder sb2 = new StringBuilder("Java cok guzel");
        StringBuilder sb3 = new StringBuilder(10);

        System.out.println("sb1 length : " + sb1.length()); // 0
        System.out.println("sb1 capacty : " + sb1.capacity()); // 16 kapsiteli

        System.out.println("sb2 length : " + sb2.length()); // 14
        System.out.println("sb2 capacty : " + sb2.capacity()); // 30

        System.out.println("sb3 length : " + sb3.length()); // 0
        System.out.println("sb3 capacty : " + sb3.capacity()); // 10

        // append methodu ile ekleme yapabiliriz
        sb1.append("Java").append(" ").append("cok ").append("guzel");

        System.out.println("sb1 length : " + sb1.length()); // 14
        System.out.println("sb1 capacty : " + sb1.capacity()); // 16

        sb1.append(3);
        System.out.println(sb1); // Java cok guzel3   3 ü de string gibi algıloyor

        sb1.append(true);
        System.out.println(sb1); // Java cok guzel3true

        System.out.println("sb1 length : " + sb1.length()); // 19
        System.out.println("sb1 capacty : " + sb1.capacity());//  34


        sb1.trimToSize();  // fazla kapasiteyi sil...length e esitle.
        System.out.println("sb1 length : " + sb1.length()); // 19
        System.out.println("sb1 capacty : " + sb1.capacity()); // 19



    }
}
