package day38_inheritance_overriding;

public class Ustabasi extends Isci{

    String statu = "Ustabasi";
    String haklar = "Ustabası haftada 1 gun extra tatil hakkına sahiptir";

    public void mesai(){
        System.out.println("Arıza varsa Ustabası extra ucret almadan calışır");
    }
    public void maasHesapla(){
        System.out.println("Ustabası 30 gun * 8 saat * 12 euro = " + (30*8*12)+ "Euro kazanır");

    }

    public static void main(String[] args) {


    }
}
