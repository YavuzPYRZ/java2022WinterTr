package day14_stringManipulation;

import java.util.Scanner;

public class C09_Calısma {
    public static void main(String[] args) {
        /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet

        // once name1 in başı ile langth in ortasına kadar olan kısmı olacagız
        // sonra name 2 yi ekleyeceigız
        // en son name1 e subsitring yapacagız lengt ortrasından başlayıp sonuna kadat

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String name1=scan.nextLine();

        System.out.println("Lutfen ikinci isim giriniz");
        String name2=scan.nextLine();


        if (name1.length()%2==0){
            System.out.println( name1.substring(0,(name1.length())/2) + name2 + name1.substring(name1.length()/2)  );

        }else {

            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
        }
*/


            // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
            // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("Birşeyler yazın");
        String str = scan.nextLine();

        int bosluk = str.indexOf(' ');

        if (bosluk == -1 && !(str.isEmpty())) {
            System.out.println("bosluk yoktur");

        } else {
            System.out.println("bosluk vardir");

        }
            }

    }

