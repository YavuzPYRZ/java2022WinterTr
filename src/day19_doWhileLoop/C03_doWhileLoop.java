package day19_doWhileLoop;

public class C03_doWhileLoop {
    public static void main(String[] args) {
        // do = yapmak demek

        //5 den kücük poz. tam sayıları yazdıralım
        // wlile loop ile sayıdan kucuk pozitif tamsayiları yazdıralım
int input = 3;
        int sayi=1;
        int sayac=1;
// while loop once konrtol yapıyor sonra işlem yapoyor
        while (sayi<input){
            System.out.println(sayi);
            sayac++;
            sayi++;
        }
        System.out.println("sayaç ; "+sayac); // 3 kez sayap çalıştı

        // aynı soruyu do while loop ile yapalım


        sayi=1; // üsteki sorudan dolayı başa aldık
        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi<input);
    }
}
