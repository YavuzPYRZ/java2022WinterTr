package day04_dataCasting_Increment;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int sayi=10;

        sayi++;
        System.out.println(sayi);
        sayi++;
        System.out.println("pre- ıncrement ten once "+sayi);//12

        System.out.println("pre- ıncrement satırında "+ ++sayi);//once artır sonra yazdır  // 13 olacak
        System.out.println("pre- ıncrement ten sonra "+ sayi);  // yine 13 olur

        System.out.println("post increment satırında "+ sayi++); // once yazdır(13-eski deger),  sonra arttır (14)

        System.out.println("post increment satırından sonra "+ sayi);



    }
    }
