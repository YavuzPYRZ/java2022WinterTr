package day02_variables;

public class C02_Variables {


    public static void main(String[] args) {

        // java çalışmaya main mathod dan baslar
        //sonra yukarıdan asagı, soldan sağa doğru çalışır
        //eger istersek variableyi once devlare edeip sonra deger atayabiliriz
        String okulIsmi;
        //java deger atamsı yapmadıdımız bir variable olusturmadıgıza itiraz etmez
        //ancak değer atayana kadat o variableyi kullanmamıza izin vermez
        okulIsmi="Yıldız Koleji";
        System.out.println(okulIsmi);//printLN dediğimizde yazdırma işleminden sonra alt satıra geçer
        // sadece print dediğimizde alt satıra geçmez

        okulIsmi="Star Kolejı";
        System.out.println(okulIsmi);
        okulIsmi="Java Koleji";

        System.out.println(okulIsmi);
    }
}
