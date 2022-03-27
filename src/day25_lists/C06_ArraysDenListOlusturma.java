package day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraysDenListOlusturma {
    public static void main(String[] args) {
        // verilen bir Arrer-y i listeye çevirin

        String arr [] = {"A","B","C"};

      //  Arrays.asList(arr); // atama yapmazsak havada kalır
        List<String> arrydenList = Arrays.asList(arr);

        // arrayden liste cevirdigimiz zaman yeni Listin uzunlugunu degistiremeyiz
        // dolayısıyla yeniList ile add() remove() clear() gibi method lar çalıştıramayız
        // istediğimizde Exception oluşur

     //   arrydenList.add("J"); // Exception oluşur

        System.out.println("21. satırsa list: " + arrydenList); // [A, B, C]
        arr[1] = "F";
        System.out.println("23. satırsa list: " +  Arrays.toString(arr)); // [A, F, C]
        System.out.println("24. satırsa list : " + arrydenList); //  [A, F, C]  yukarıda sadece array e atama yaptık
                                                            // ama arrayden olusturulan yeni list de degisti.

        arrydenList.set(0,"Y"); // list in ilk index ini degistir

        System.out.println("29. satırda array : " + Arrays.toString(arr)); // [Y, F, C] list degişince array de degisti
        System.out.println("30. sarırsa List : " + arrydenList); // [Y, F, C]
    }
}
