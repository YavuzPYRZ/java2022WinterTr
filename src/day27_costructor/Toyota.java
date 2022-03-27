package day27_costructor;

public class Toyota {
    String marka = "Toyota";
    int tekerAdedi=4;
    boolean motoruVarMı=true;

    String model;
    String yakit;
    int yil;

    public void maxHiz(){
        if (yakit.equals("Benzin")){
            System.out.println("Benzin max 240km hız yapar");
    }else if (yakit.equals("Dizel")){
            System.out.println("Dizel max 260km hız yapar");
        }
    }

    public void renkTercihleri(){
        if (model.equals("Corolla")){
            System.out.println("Corolla renk secenekleri Kırmızı ve Beyaz");
        }else if (model.equals("Yaris")){
            System.out.println("Yaris renk secenekleri Sari ve Lacivert");
        }
    }
}


