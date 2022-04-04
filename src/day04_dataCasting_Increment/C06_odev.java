package day04_dataCasting_Increment;

public class C06_odev {
    public static void main(String[] args) {
        int num1 = 9 ;
        int num2 = num1++;// arttırma işlemi .....deger atama işlemi hingisi once asıl soru bu..

                            //++ once ise(++num1) once deger artır()num1 artık 10 olur.
                             // sonra atama yap(num 2 ye eşitle)


                            //++ sonra ise (num1++) once degeri atar(num2 artık 9 olur)
                            // sonra ise num 1 i arttırır.



        if (num2 <10){
            System.out.println(num2 + " merhaba");

        }else System.out.println(num1 + " acaba?");
    }
}
