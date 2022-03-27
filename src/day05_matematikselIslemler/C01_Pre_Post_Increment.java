package day05_matematikselIslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi=10;
        sayi++;
        System.out.println(sayi);

        System.out.println(++sayi); //once arttırdım sonra yazdırdım pre-Increment denir buna

        System.out.println(sayi++); // once yazdırdı(eski degeri) sonra arttıdı
                                    // bu satırın sonunda yeni degere ulasır


    }
}
