package day18_nestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        // kullanıcıdan bir rakam alıp carpım tablosu oluşturualım

        int input=3;

        //1 2 3    1*1    1*2  1*3
        // 2 4 6   2*1    2*3  3*3
        // 3 6 9   3*1    3*2  3*3

        for (int i = 1; i <=input ; i++) {
           // System.out.println(i); // bu 1
                                    //   2  yazdırır
                                    //   3
            for (int j = 1; j <=input ; j++) {
                System.out.print((i*j)+" ");
            }
            System.out.println(""); // satiri aşagıya gecirmek icin kullanılır 

        }

    }
}
