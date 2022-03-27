package day07_ifElseStatements;

public class C01_İfStatements {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if (a != b) {
            System.out.println("a b ye eşit degildir"); // çalıştı bady çalıştı ekrana verdi
        }
            if (a > 100) {
                System.out.println("a yüzden büyük"); // çalıştı ama body çalışmadı ve ekrana birşey çıkmadı
            }

            if (a * b > 1) {
                System.out.println("sayiların çarpımı 1 den büyük");

                //bağımsız if cümleleri kendileri dışındakı kodlarla ilgilenmez
                //hiç birinin bady si çalışmaya bilir
                //bir sart ve o sarta baglı sonuca odaklanır
            }



    }
}
