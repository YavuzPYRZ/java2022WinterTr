package day13_stringManipulation;

public class C04_substringTekrar {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5));// "ile IT cok guzel" 5 indek olan i yi buldu i den sonra yazdırdı

        System.out.println(str.replace("Java","Mehmet Hoca"));

        System.out.println("Mehmet Hoca "+str.substring(5));
        System.out.println(str.substring(0,4)); // Java
    }
}
