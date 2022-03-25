package day07_ifElseStatement;

import java.util.Scanner;

public class C07_Sorular {
    public static void main(String[] args) {

        //Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin
        //hesaplama sonucunda ekrana kare olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uzun kenari giriniz");
        int uzunKenar= scan.nextInt();
        System.out.println("Lutfen kisa kenari giriniz");
        int kisaKenar= scan.nextInt();

        if (uzunKenar>kisaKenar){
            System.out.println("Bu bir kare degildir");
        }

        if (uzunKenar==kisaKenar){
            System.out.println("Bu bir karedir");

        }




    }
    }