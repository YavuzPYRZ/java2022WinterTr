package day22_arrays;

public class C08_calısma {
    public static void main(String[] args) {
        // verilen arrayde istenen bir elementin var olup olmadıgını
        // true folse yazdırarak gosteren bir method olusturun
        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        int arananSayi=45;

        arananSayiArraydeVarMı(arr,arananSayi);
    }

    public static void arananSayiArraydeVarMı(int[] arr, int arananSayi) {

        for (int i = 0; i <arr.length ; i++) {
           if (arr[i]==arananSayi){
                System.out.println("True");
            }
        }
    }
}
