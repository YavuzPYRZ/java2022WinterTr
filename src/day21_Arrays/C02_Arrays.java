package day21_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) { // string degerlerin oldugu bir Array mişşşş

        String arr1[]={"Ali", "Veli", "Ayse"};

                // array icindeki elemetlere ulasa bilmek ivin indek kullanırız

        System.out.println(arr1[0]);  // arr1 deki 0. index deki Ali yazdırdı

        arr1[1]="Esila";

        System.out.println(arr1[1]); // artık ali oldu Esile oldu
        // arrayin icideki index i kullanarak elementlere ulasabilir ve update edebiliriz

        int arr2[]=new  int[4]; // yeni bir array tanımladık icine 4 tane defeolt olusturudu

        System.out.println(arr2[1]); // 0
        System.out.println(arr2[3]); // 0
       // System.out.println(arr2[5]); // Hata verir Arrayin dışına cıktın diyor

        // array yin tamamını yadırmak istersek

        System.out.println(arr2); // [I@5b464ce8 bu bir referans dır kendisi degil referansını veriyor
        // arrayler nun-primitiv olduklarından direk yazdırmak istersek

        for (int i = 0; i < 4; i++) {
            System.out.print(arr2[i] + " "); // 0000 yazdırdı for dongusunu kullandık
            // array i yazdırmak icin javadaki Arrays clasından toString methodu kullanıırız

            System.out.println("to string de"+Arrays.toString(arr2)); // [0, 0, 0, 0]


            arr2[1]=11;
            arr2[3]=22;
            System.out.println(Arrays.toString(arr2)); // arr2 nin son degeri [0, 11, 0, 22] oldu
        }

    }
}
