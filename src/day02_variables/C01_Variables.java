package day02_variables;

public class C01_Variables {

    public static void main(String[] args) {
        // bir variable oluşturuken içerisıne koyavağım datanın alabıleceği dergere uygun bir data türü seçmeliyiz

        // örneğin bir şehrin nufusundan bahsediliyorsa
        // varianla mizin data türü strind boolen char veya double olamaz
        //geriye kalan tamsayı türlerinde sehrin nufusunu içine alabilecek büyüklükte bir data türür seçebiliriz
        //bir kursta int kullanacağız
        System.out.println("Hello World yazdıran Javayı Halleder");


        int level=9;

        System.out.println(level);

        boolean ogrenciMi= true;
        boolean yagisVarMı= false;
        System.out.println(ogrenciMi);
        char ozelSembol='3';
        char harf ='K';

        System.out.println(harf);


    }
}
