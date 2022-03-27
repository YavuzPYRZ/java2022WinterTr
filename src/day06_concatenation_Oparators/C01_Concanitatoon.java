package day06_concatenation_Oparators;

public class C01_Concanitatoon {

    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;

        //variable lerin değerini değiştirmeden bu variableleri kullanalrak yazdırın

        //Java5Guzel
        System.out.println(str1+sayi1+str2);

        //2Guzel15
        System.out.println((sayi1-sayi2)+str2+(sayi1*sayi2));
        System.out.println(sayi1+(sayi2+str2+sayi1*sayi2));//once çarpma yapar sonra baştan başlar
                                                        // burada string girmez int ile iş yapılr

        //Java22

        //System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2)); BAK

        // 53Guzel

        System.out.println(sayi1+(sayi2+str2));
        System.out.println(""+sayi1+sayi2+str2);//eger tamamen sayılardan olusan bir String varsa
                                            // ve biz bunu int'a cevirmek istersek Integer.valueOf(str)

                            // bir sayiyi String'e vevirmek istersem
                            // ""+sayi yaparız(başına bos tırnak kıyarsak hepsi String olur

        System.out.println(5*2<15);
    }
}
