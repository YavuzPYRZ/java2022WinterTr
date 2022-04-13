package day41_exceptions;

public class C01_Exception {
    public static void main(String[] args) {
        int a = 10;
        int b =0;
        int c = 0;


        try {
            c = a/b;
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println(e.getMessage()); //   / by zero
            System.out.println(e.getCause()); // null cok onemli degil. e objesi uzerinden işlem yapabiliyoruz.
        }

        System.out.println(c);
    }
}
