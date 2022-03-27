package day10_switch_StringManipulation;

public class C07_Tekrar_Manipulaation {
    public static void main(String[] args) {
        String str1= "Java";
        String str2="Candır";


        String cumle= str1.concat(str2);//JavaCandır

        cumle = str1.concat(" ").concat(str2); //Java Candır

        System.out.println(cumle);
    }
}
