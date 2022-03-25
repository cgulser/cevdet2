package day11_stringManipulation;

import java.util.Scanner;

public class C005_IndexOfSorular {
    public static void main(String[] args) {

        //Kullanicidan bir cumle ve bir harf isteyin harfin cumlede var olup olmadigini yazdirin.

       String cumle="Java ile IT cok guzel";
       String harf="g";

       int kullanim=cumle.indexOf(harf);

       if (kullanim==-1){
           System.out.println("Girilen harf cumlede kullanilmamistir");
       } else {
           System.out.println("Girilen kelime cumlede kullanilmistir");
       }





    }
}
