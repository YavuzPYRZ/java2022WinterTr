package day27_costructor;

public class Z {

    String isim;
    String soyIsim;
    int numara;
    boolean gerçekMi;

    public Z(String ism, String soyism, int no, boolean grc) {
    isim=ism;
    soyIsim=soyism;
    numara=no;
    gerçekMi=grc;

    }
    public String toString(){
        return (" Isim : "+ isim+
                " Soyisim : "+ soyIsim +
                " , numara" + numara);
    }
}
