package day29_staticKeyword;

public class C02_statikKeyword {
    public static void main(String[] args) {
        // Baska class daki statik class uyelerine ulasmak için sadece class ismi.staticUyeIsmi yazmanız yeterlidir.
        System.out.println(C01_Static.okulTelefonu); // 3122563635
        C01_Static.okulTelefonu="3125474747"; // statik veriable bir kez degiştimi tam degişir.
        System.out.println(C01_Static.okulTelefonu); // 3125474747

        // başka class daki statik olmayan class uyelerine ancak o class dan obje oluşturarak ulaşabilir.
        // ve obje ile yapılan atamalar sadece o obje için geçerli olur.

        C01_Static obj1 = new C01_Static();
        C01_Static obj2 = new C01_Static();

        System.out.println(obj2.okulIsmi); // Yildiz koleji

        obj2.okulIsmi = "Sabir Koleji";
        System.out.println(obj1.okulIsmi); // Yildiz Koleji biz obj1 i degiştimedik o standar olanı aldı.
                                            // Beni baglamaz dedi :)

    }
}
