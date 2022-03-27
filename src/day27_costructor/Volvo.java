package day27_costructor;

public class Volvo {
    String marka = "Volvo";
    String mensei = "İsvec";

    String model;
    boolean elektrikliMi;
    String yakit;
    int yil ;

    boolean otomatikPilot=otomatikPilotSorgusu();
    int maxHiz=maxHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model=mdl;
        elektrikliMi=elk;
        yil=yl;
        yakit=ykt;

    }

    public Volvo(){

    }


    public int maxHizAta() {
        int maxHiz=0;
        if (elektrikliMi){
            maxHiz=160;
        }else {
            maxHiz=240;
        }
        return maxHiz;
    }


    public boolean otomatikPilotSorgusu() {
        boolean sonuc =true;
        if (elektrikliMi){
            System.out.println(true);
        }else {
            sonuc=false;
        }
            return sonuc;

    }

    public String toString(){
        String arabaOzellikleri= "Model : " + model +
                " Yakit : " + yakit +
                " Max Hiz : " +maxHiz;
        return arabaOzellikleri;
    }




}
