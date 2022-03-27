package day15methodCreation;

public class C04 {

    public static void besHarfiTersineCevir(String kelime) {
        String  tersKelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdigınız kelimenin harf sayısı 5: ");
        System.out.println("Kelimenin Tersten yazılması : "+ tersKelime);

    }



    public static void dortHarfiTersineCevir(String kelime) {
        String  tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdigınız kelimenin harf sayısı :4 ");
        System.out.println("Kelimenin Tersten yazılması : "+ tersKelime);

    }


    public static void ucHarfiTersineCevir(String kelime) {
        String  tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("Girdigınız kelimenin harf sayısı :3 ");
        System.out.println("Kelimenin Tersten yazılması : "+ tersKelime);

    }

}
