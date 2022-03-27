package day06_concatenation_Oparators;

public class C03_Mantık_Oparetorları_Tekrar {
    public static void main(String[] args) {


        System.out.println(5+2==8); //folse

        boolean sonuc1=5>4 && 6*9!=1 && 'a'!='A' ;
        boolean sonuc2=5>4 && 6*9==1 && 'a'!='A' ;

        System.out.println(sonuc1);// True
        System.out.println(sonuc2);// False Ama && arsındaki farkı=>6*9==1 e baktı false digerlerine bakmadı
                                    //niye bakacacağım der
        boolean sonuc3=5>4 & 6*9==1 & 'a'!='A' ;
        System.out.println(sonuc3); //False cünku sadece 1 tanesi bile False olsa sonucu False yapar


    }

}
