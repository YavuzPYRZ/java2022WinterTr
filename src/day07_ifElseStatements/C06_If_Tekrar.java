package day07_ifElseStatements;

public class C06_If_Tekrar {
    public static void main(String[] args) {

        int a=2;
        int b=3;

        if (a<b){
            System.out.println(a+b); // calıstı ama body devreye girmedi.
        }

        if ((a==b) || (b>a)){
            System.out.println("calıstı sımdı");
        }

        if (a*b>5){
            System.out.println("a*b 5 den buyuktur."); // calısır yazıyı ekrena getirir.
        }
    }
}
