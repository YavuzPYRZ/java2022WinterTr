package day27_costructor;

public class VolvoRunner2 {
    public static void main(String[] args) {
        // Her obje olusturdugumuzda model yakıt gibi degerleri tek tek atama yapmak istemiyorsanız

        Volvo arb1= new Volvo("XC60",false, 2023,"Benzin");

        System.out.println(arb1.toString()); //Model : XC60 Yakit : Benzin Max Hiz : 240
        System.out.println(arb1); //  Model : XC60 Yakit : Benzin Max Hiz : 240  boyle de oluyor.

    }
}
