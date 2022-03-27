package day10_switch_StringManipulation;

import java.util.Scanner;

public class C06_Tekrar {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ay rakamı giriniz");
        int ayRakami=scan.nextInt();

        switch (ayRakami){
            case 12 :
            case 1 :
            case 2 :
                System.out.println("Pencereden Kar geliyor\n -----Yani KIŞ-----");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("çiçek bocek pıknik :) ");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("cısdak cısdak");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Sonbahar Sonbakar \n Sarardı Bütün Yapraklar \n \n Niloya");
                break;
            default:
                System.out.println("Lütfen Girişinizi Konrtol ediniz");

        }
    }
}
