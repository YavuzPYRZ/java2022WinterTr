package day21_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        // data türü , arrayin ismi ve koseli parantez yazarak array deklare edilir

        int arr1[] ={1,3,5};
        int[] arr2={1,3,5};    //3 farklı array olusturma sekli var.
        int []  arr3={1,3,5};

        double arr4[]={20.5,56.8,0.45};
        String arr5[]={"Ali", "Veli", "Deli"};

        // assign sart/mecburi midir?

        int sayi;
        int arr6[]; // degilmiş ama kullanmadan once mutlaka deger ataması yapmamız gerekir

        // hem declare edip hemde atama yapacaksam nasıl yapabiliriz?

        //1-  deklare edip eşitligın sagına suslu parantez ıcerisnde degerleri yazabilirim
        //2-  icene deger atamadan olusturmak isteseiz, boyutunu belitlememiz gerekir

        int arr7[]=new int[5];// java der ki icine 5 tane default(0,0,0,0,0) deger olan bir array olusturur



    }
}
