package day17_forLoop;

public class C04_forLoop {
    public static void main(String[] args) {

       /* for (int i = 10; i <=30 ; i++) {
            System.out.print(i+",");
        }*/     //   ------BAAAAAAAKKKK------

        int baslangic =10;
        int bitis=30;

        for (int i =baslangic; i <=bitis ; i++) {
            if (i<bitis){
                System.out.print(i +",");// println deki ln sildik

            }else System.out.println("i");
        }

    }
}
