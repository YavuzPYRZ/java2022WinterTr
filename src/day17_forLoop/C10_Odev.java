package day17_forLoop;

public class C10_Odev {
    public static void main(String[] args) {
        //Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 
        // 1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
        //        - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
        //        - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
        //        - Sayi hem 3’un hem 5’in kati ise sayi yerine "Java Guzeldir" yazdirin.


        int input = 16;

        for (int i = 1; i <=input ; i++) {

            if ( i%15==0){
                System.out.print("Java Guzeldir15 ");

            }else if (i%5==0){
                System.out.print("Java5 ");

            }else if (i%3==0){
                System.out.print("Java3 ");
            }else{
                System.out.print(i+" ");
            }
        }


        
       /* int girilensayi=87;

        for (int i = 1; i <=girilensayi ; i++) {

            if (i%3 ==0 && i%5==0){
                System.out.print("Java Guzeldir15 ");

            }else if (i%3 ==0){
                System.out.print("Java3 ");

            }else if (i%5==0){
                System.out.print("Guzeldir5 ");
            } else{
                System.out.print(i + " ");
            }
            
        }
        
        */
        
    }
}
