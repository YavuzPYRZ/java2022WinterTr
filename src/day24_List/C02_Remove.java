package day24_List;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();

        isimler.add("Aykut");
        isimler.add("yusuf");
        isimler.add("ilker");
        isimler.add("oguzhan");

        System.out.println(isimler);

       boolean sonuc = isimler.remove("oguzhan"); // true donecek boolean bir şeye atayarak
                                                    // bunu silip silmedigimiz gorebilmemiz için yol yaoarız
                                                    //      (if le gorebiliriz aşagıda var)
        System.out.println(isimler);
// sonucu kullanıcıya yazdımak istersejiz istediginiz degerlendirmeyi yazabilirsiz
        if ( sonuc == true){
            System.out.println("İstedigıniz isim kaldırıldı");

        }else {
            System.out.println("isim yokdu kaldıramadık");
        }


        System.out.println(isimler); // [Aykut, yusuf, ilker]

      sonuc= isimler.remove("berk");
        if ( sonuc == true){
            System.out.println("İstedigıniz isim kaldırıldı");

        }else {
            System.out.println("isim yokdu kaldıramadık");
            // remove (index) yazdıgımızda sildim silmedim ihtimali kalmaz
            // bize remove edilen elementi doner

            System.out.println(isimler.remove(1)); // yusufu siler ve delil olarak yusuf ismini gerir
            //yazdırsak da yazdırmasak da liste degisti ve 1. index deki elmeent silindi
        }



    }
}
