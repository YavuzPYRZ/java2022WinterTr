package day07_ifElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        /*
        if (a*b>100){a=a*2;
            System.out.println("a nın yeni degeri "+a);
        }
        */
        if (a<b && b<100){
            System.out.println("isteğiniz gerçekleşecek");
            System.out.println("body icindeki tum kodlat calısır");
        }
        if (a>0) System.out.println("suslu parantez olmasa sadece bir satir çalışır");
                            //if in bütün gücü ; gorunce biter..
                            //if i he
        System.out.println("2. satır calıstı");
    }
}
