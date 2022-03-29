package day30_passByValue;

public class C01_StaticBlocks {
    static {

        System.out.println("Statik blok çalıştı");  // once Statik blok calıştı HEP İLK BU CALISIR
                        //ama yine de main method olmadan çalışmaz...
            // class calışmaya başlamadan yapmamız gereken ön atamalar varsa onları yapar....
            // yazıldıgı satırın hiç bir onemi yoktur. Main maehodun içinde olmaz.(mainde statik sayi bile olmaz...)
            // cunku statik class level birşeydir.
        // Statik block birden fazla olursa blocklar yukarıdan aşagıya dogru çalışır.
    }

    C01_StaticBlocks(){
        System.out.println("Construcktor calisti"); // mainden sorna burası çalıştı
    }

    public static void main(String[] args) {
        System.out.println("Main method başlangıcı"); // statikden sonra çalıştı.
        C01_StaticBlocks obj1; // obje tanımladık ama oluşturmadık  ---BAAAK bu satıra ---
        new C01_StaticBlocks();

    }
}
