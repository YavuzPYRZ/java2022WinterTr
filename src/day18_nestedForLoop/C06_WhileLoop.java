package day18_nestedForLoop;

public class  C06_WhileLoop {
    public static void main(String[] args) {   // --- BAAKKKK-----
        // kullanıcıdan iki tam sayı alıp
        // bu sayıları ve aralarındaki tum tam sayileri yazdıran bir kok olusturun

        int baslangic=40;
        int bitis = 60;

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i +" ");
        }
        System.out.println("");

        // aynı soruyu while loop ile yapalım

        int i = baslangic;
        while (i<=bitis){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        // i sayesinde başlangıc degısmedi 61 degıl 40 olarak kaldı
    }
}
