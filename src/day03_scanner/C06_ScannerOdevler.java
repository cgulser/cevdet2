package day03_scanner;

import java.util.Scanner;

public class C06_ScannerOdevler {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        //Kullanicidan isminizi ve soyisminizi alip asagidaki gibi yazdirin.
        //isminiz  : mehmet
        //soyisminiz : bulut
        //Kursumuza katiliminiz saglanmistir, tesekkur ederiz.

        System.out.println("lutfen isminizi giriniz ");
        String isim= scan.nextLine();

        System.out.println("lutfen soyisminizi giriniz ");
        String soyisim= scan.nextLine();
        System.out.println("isminiz :" + isim);
        System.out.println("soyisminiz :" + soyisim);
        System.out.println("Kursumuza katiliminiz saglanmistir, tesekkur ederiz.");


    }
}
