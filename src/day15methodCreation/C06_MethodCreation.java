package day15methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {

        int a=10;
        int b = 20;


        //iki veriable'nın degerini toplayan bir method olusturalım
        //1. adım method adını yazalım
        //2. adım method a gondermem gereken orguman var mı?

        //ikiSayiTopla(a,b); // burayı silersek calısmak cunku calısmaz

        ikiSayiTopla(25,50); //içerigi degistirdik ama yine de calıstı




    }

    //bir method u olusturmak calısması icin yeterli degıldir
    //method ancak cagrılırsa calısır

    //aynı calss veya farklı class da olmasının hic bir onemi yoktur
    //java main method da yıkarıdan asagı calısır ve geldigu satırı calısır


    public static void ikiSayiTopla(int a, int b) {

        System.out.println("verilen sayıların toplamı "+ (a+b));
    }
}
