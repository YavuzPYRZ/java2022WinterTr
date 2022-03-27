package day12_stringManipulation;

public class C03_contains {
    public static void main(String[] args) {
        // Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        String email="mulkiyeayboy@tmail.com";

        String arananMetin="@gmail.com";

        if (!email.contains(arananMetin)){  // burada ! aranan metni icermiyor dmek // totalde True(içermiyor)
                                            //  ! ne buluyorsa tersini alır
            System.out.println("Lütfen gmail adresi giriniz");

        }else if (email.lastIndexOf(arananMetin)==email.length()-10){
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("yazimi kontol edin");
        }


    }
}
