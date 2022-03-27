package day09_ternary_Switch;

public class C06_Tekrar2_Ternary_Nested {
    public static void main(String[] args) {
        //verilen sayının poz. yada negatif olduğunu kont et.
        //0 veya pozitif ise tek ya da cıft
        //negatif ile -100 den büyük ya da kücuk old. belirleyen ternary yazınız

        int sayi =10;

        System.out.println(sayi>=0?
                (sayi%2==0 ? "+ cift sayi" : "+ Tek Sayi"):
                ( sayi>-100 ? "-100 den buyuk":"-100 den kucuk"));
    }
}
