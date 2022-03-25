package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        //kullanicidan bir tam sayi alip tek mi cift mi

        Scanner scan=new Scanner(System.in);
        System.out.println("pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();

        // if uzun yol ama gereksiz degil bilmemiz gerek

        if (sayi%2==0){
            System.out.println("sayi cift");

        } else {
            System.out.println("sayi tek");
        }

        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek"); // **Bu kisa yoldur



    }
}
