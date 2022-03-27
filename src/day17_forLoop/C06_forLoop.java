package day17_forLoop;

public class C06_forLoop {
    public static void main(String[] args) {
            // verilen iki harf ve aralarindaki harfleri yazdiran   ---- BAAAAAAKKKKKK -
            // bir kod yaziniz
        char ilkHarf='c';
        char sonHarf='s';

        for (char i = ilkHarf; i <=sonHarf ; i++) { // burada arttırıp azaltabilecegimiz seyler kullanırız
                                                    // dooble da olur ama boolen olmaz
            System.out.print(i+ " ");
        }


        double baslangic = 10;
        double bitis = 120;
        double artis = 0.2;

        for (double i = baslangic; baslangic <bitis; artis++) {
            System.out.println(i+ " ");
        }

    }
}
