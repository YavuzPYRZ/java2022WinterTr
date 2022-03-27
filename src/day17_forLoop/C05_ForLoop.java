package day17_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

//Kullanicidan 100’den kucuk bir tamsayi isteyin.
// 1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.

        int sayi =55; // kullanıcıcan bir sayı almış gibi yaptık

        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0){
                System.out.print(i+" ");// bosluk yazlıdıgında rakamlar arası belli olsun diye yazdık

            }
        }

    }
}
