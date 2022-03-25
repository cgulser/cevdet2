package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // esitligin saginda yeni bir scanner olusturulur

        System.out.println("Lütfen isminizi giriniz");

        String kullaniciIsmi= scan.nextLine();
        System.out.println("kullanicinin girdigi isim : " + kullaniciIsmi);



    }
}
