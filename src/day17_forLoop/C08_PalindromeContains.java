package day17_forLoop;

import java.util.Scanner;

public class C08_PalindromeContains {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden
        // bir method olusturun.
        String input = "Nazan";
        palindromeKontrolEt(input);
    }
    private static void palindromeKontrolEt(String input) {
        String terstenInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            terstenInput+=input.toUpperCase().charAt(i);
        }
        System.out.println("Girdiginiz kelimenin tersten yazilisi : " + terstenInput);
        if (input.toUpperCase().contains(terstenInput)){
            System.out.println("Girdiginiz kelime palindrome");
        }else if (!input.toUpperCase().contains(terstenInput)){
            System.out.println("girdiginiz kelime palindrome degil");
        }

        //Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
//toplayip, sonucu yazdiran bir program yaziniz

        int num1 = 5;
        int num2 = 1;
        int sayilarinToplami =0;

        for (int i = num1; i <= num2; i++) {

            sayilarinToplami += i;
        }
        System.out.println(sayilarinToplami);

    //Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
        //sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen 10’dan kucuk bir tamsayi giriniz: ");
        int sayi = scan.nextInt();
        int faktoriyel = 1;

        for(int i = 1; i <= sayi; i++)
        {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi + "!= " + faktoriyel);

            }


        }

