package day09_ternary_Switch;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();


        String sonuc=sayi>=100 ? "sayi üc basamakli veya daha buyuk" : "sayi negatif veya 3 basamaktan kucuk";

        System.out.println("girdiginiz sayi analizi: "+ sonuc);


        // Mutlak deger sorusu

        System.out.println("Lütfen bir sayi giriniz");
        int sayi1= scan.nextInt();
        System.out.println(sayi1<=5 ? sayi1 : ((-1) * sayi1));





    }
}
