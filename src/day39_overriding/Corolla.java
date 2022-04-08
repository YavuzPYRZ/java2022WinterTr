package day39_overriding;

public class Corolla extends Toyota{
    protected String hız ="Corolla max 200 km hız yapar";
    protected String yakıt ="corolla benzinli veya elektriklidir";


    public void motor(){

        System.out.println("Corolla araçlar çevreci motor kullanır");
    }

    public void yakitTuketimi(){
        System.out.println("Corolla 5,6 lt yakıt tuketir");
    }

    public void vitesSayisi(){

        System.out.println("corolla 5 viteslidir");
    }
}
