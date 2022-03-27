package day22_arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {
        String str="Java gun gectikce guzellesiyor";

       String kelimeler[]= str.split("");

        System.out.println(Arrays.toString(kelimeler)); // [J, a, v, a,  , g, u, n,
                                                    // , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, s, i, y, o, r]

        System.out.println(kelimeler[1]); //  --- bak-----
        String gectikce[]=str.split("gectikce");
        System.out.println(Arrays.toString(gectikce)); // [Java gun ,  guzellesiyor]
    }
}
