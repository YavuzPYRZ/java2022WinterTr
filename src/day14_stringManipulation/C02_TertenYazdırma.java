package day14_stringManipulation;

public class C02_TertenYazdırma {
    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
        String input="Mavi";

        String tersStr=input.substring(3,4);
        String tersStr1=input.substring(2,3);
        String tersStr2=input.substring(1,2);
        String tersStr3=input.substring(0,1);

        System.out.println(tersStr.toUpperCase()+tersStr1.toLowerCase()+tersStr2.toLowerCase()+tersStr3.toLowerCase());
    }
}
