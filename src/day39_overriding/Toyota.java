package day39_overriding;

public class Toyota extends Araba{

    String hiz ="Toyota";
    protected String yakıt ="Arabalar farklı yakıtlar kullanabilir";
    protected String marka = "Toyota";
    String sirketMerkezi = "Japonya";


    public void motor(){

        System.out.println("Toyota arabalar toyota marka motor kullaır.");
    }

    public void garanti (){
        System.out.println("toyota araclar 10 yıl garantilidir.");
    }
}
