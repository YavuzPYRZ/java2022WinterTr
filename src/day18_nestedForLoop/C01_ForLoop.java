package day18_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        // ve girilen sayinin faktoryel'ini bulun. (5!=5*4*3*2*1)

        int input = 4;
        int faktoriyel =1;  //her carpımda elde ettigimiz fktoriyelin icine koyacagımız konteryner (ilk icine 1 yazdık)
        String faktoriyelAcikYazim="";  //

        for (int i =input; i >=1 ; i--) {
            faktoriyel*=i; // ilk tur da>>>> i(faktoriel)*9(input) >>>9 olur 2. turda 9(eski deger)*8=72.....

            if (i==input) {
                faktoriyelAcikYazim =faktoriyelAcikYazim + i; //  9 iken sadece 9 yazdı
            }else {
                faktoriyelAcikYazim =faktoriyelAcikYazim + "*"+ i; // diger durumlarda once * sonra rakam yazdı

                                                                    // yıldızlı muhabbetlerini
                                                                    // loop un icinde String olarak yaptık
            }

        }
        System.out.println(input + "! = "+ faktoriyelAcikYazim +"="+  faktoriyel);


    }
}
