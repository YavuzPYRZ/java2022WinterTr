package day30_passByValue;

import java.util.Arrays;

import static day30_passByValue.C06_PassByValue.arrDegistir;

public class C07_PassByValue {
    public static void main(String[] args) {


        int arr[] = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
        arrDegistir(arr);
    }
}
