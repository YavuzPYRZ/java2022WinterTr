package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {

        String str ="   Java bildigını okur    ";
        str.trim();
        System.out.println(str); //    Java bildigını okur    // bosluklu cıktı
        // yukarıda atama olmadığı icin boşluklu cıkar

        System.out.println( str.length());

        str=str.trim();

        System.out.println(str);//Java bildigını okur//  bastaki ve sondaki boslukları sildi

        System.out.println(str.length());

    }
}
