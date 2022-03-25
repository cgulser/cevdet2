package day19_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {

    public static void main(String[] args) {

        //Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        // Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        // ve “Negatif sayi giremezsiniz” yazdirip basa donun
        // Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        // yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin
        // toplaminin kac oldugunu yazdirin.


        Scanner scanner = new Scanner(System.in);

        int sayi=10000;
        int toplam=0;



        do {

            System.out.println("Lutfen pozitif bir tam sayi giriniz \nbitirmek icin 0 a basin");
            sayi= scanner.nextInt();
            if (sayi<0){

            }


        }while (sayi!=0);




    }


}
