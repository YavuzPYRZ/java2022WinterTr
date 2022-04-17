package day43_garbage_abstractClass;

public class C02_Final extends C01_Final{
    public static void main(String[] args) {
        System.out.println(C01_Final.okulIsmi);
       // C01_Final.okulIsmi="Hasan koleji"; final oldugu için kullanabilirsin ama degiştiremezsin.
    }
/*
    public static final void method1(){
        System.out.println("Parent class final method");
    }


    parent daki final method u burada override edemiyoruz. kendimize uyarlayamıyouz yani.
    işlevini uyarlamak-degiştirmek istiyoruz am Java buna izin vermez.


 */
}
