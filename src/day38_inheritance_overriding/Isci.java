package day38_inheritance_overriding;

public class Isci extends Personel{

    public String statu = "Isci";
    public String haklar = "Iscile Kıdem Tazminatı alırlar";
    public String ikramiye = "isciler yilsa 1 ikramiye alır.";

    public void mesai(){
        System.out.println("Tum Isciler haftalık 40 saat çalışır.");
    }
    public void maasHesapla(){
        System.out.println("30 gun * 8 saat * 11 euro = " + (30*8*11)+ "eruro kazanır");

    }
}
