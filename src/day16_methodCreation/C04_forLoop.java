package day16_methodCreation;

public class C04_forLoop {
    public static void main(String[] args) {
        //verilen Stringi tersten yazdıran bir kod yazınız

String str ="Java Cok zevkli";

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.substring(i,i+1));
        } System.out.println("");





      /*  for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.substring(i,i+1));
        }
*/


    }
}
