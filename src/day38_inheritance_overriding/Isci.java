package day38_inheritance_overriding;

public class Isci extends Personel{

    String statu = "Isci";
    String haklar = "Iscile Kıdem Tazminatı alırlar";
    public void mesai(){
        System.out.println("Tum Isciler haftalık 40 saat çalışır.");
    }
    public void maasHesapla(){
        System.out.println("30 gun * 8 saat * 11 euro = " + (30*8*11)+ "eruro kazanır");

    }
}
