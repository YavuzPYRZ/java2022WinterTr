package day38_inheritance_overriding;

public class Personel {

    public String statu = "Personel";
    public String haklar = "Tüm personel esit haklara sahiptir";
    public String izin = "Tüm personele yılda 4 hafta izin var";

    public void mesai(){
        System.out.println("Tum personel 5 gon . gunde 8 saat çalışır.");
    }
    public void maasHesapla(){
        System.out.println("30 gun * 8 saat * 10 euro = " + (30*8*10)+ "eruro kazanır");

    }

}
