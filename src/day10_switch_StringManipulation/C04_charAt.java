package day10_switch_StringManipulation;

public class C04_charAt {

    public static void main(String[] args) {

 //       BAK

        String str= "Java Cok Guzel";

        System.out.println(str.charAt(0)); //j yazdırır

        System.out.println(str.charAt(2)); //G yazdırır

        System.out.println(""+ str.charAt(2)+str.charAt(3)); //va yazdırır

        System.out.println(str.toUpperCase().charAt(5)+
        "" +str.toUpperCase().charAt(6)+
        str.toUpperCase().charAt(7)); //cOK yazdırır c kucuk

    }

}
