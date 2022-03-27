package day27_costructor;

public class Cons02 {
    public static void main(String[] args) {
        Cons01 obj1 =new Cons01(); // (ilk default constructor devrede) // burası parametresiz

        /*Cons01 clasında hic constructor olusturmaksak
        Java default construcktor u kullandıgındn obj1'i uretebiliriz
        Ancak biz parametreli veya parametresiz bir constraktor yazdıgımızda
        Java default construcktor'i siler.

        Dolayısıyla biz herhangi bir construcktor olusturdugumuzda daha once baska
        claslar veya kullanıcıların olusturmus olabilecegi objeleri kullanabilmek
        icin default construcktor'un islevini gerceklestirecek parametresiz
        bir constrockter olusturmakta fayda var.



        */
        Cons01 obj2 =new Cons01("Java"); // burası parametreli

    }
}
