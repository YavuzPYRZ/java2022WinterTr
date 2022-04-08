package day39_overriding;

public class Araba {

    protected String hareket ="Arabalar Teker ile hareket eder";
    protected String hız ="Arabalar motor gucune gore hız yaparlar";
    protected String yakıt ="Arabalar farklı yakıtlar kullanabilir";
    protected String marka = "Arabalar uretildigi maarkaya sahiptir";


    public void motor(){

        System.out.println("Arabalar farklı markalarda motor kullanır");
    }

public void yakitTuketimi(){
    System.out.println("arabalar motor gucune gore yakıt tekitirler");
}
}
