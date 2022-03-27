package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {
        String str="Bugun ne cok sey ogrendik";

        // bu bumledeki bosluk dısındaki karakter sayısını bulunuz

        System.out.println("space olmadan karakter sayısı : "+ str.replace(" ","").length());
        // atama yapılmadığı surese orijinal olarak degısmez
        // sadece o satır için degısıklık yapılıp sonuç yazdırılmış olur

        System.out.println("orjinal str karakter sayısı "+ str.length());


        // str da kalıcı değısıklık yapalım
        // bugunyerine yarın
        // ogrendik yerine ogreneceoız

        str=str.replace("Bugun","yarın");
        str=str.replace("ogrendik","ogrenecegız");

        System.out.println("kalıcı degısıklikden sonra :"+str);
    }
}
