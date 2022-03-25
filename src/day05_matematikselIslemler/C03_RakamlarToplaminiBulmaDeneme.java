package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulmaDeneme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz :");

        int sayi= scan.nextInt();
        int rakam=0;
        int rakamlarToplami=0;

        //1. Adim
        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;

        //2. Adim
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        //3. Adim

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        System.out.println("Girdiginiz rakamlar toplami: " + rakamlarToplami);



    }
}
