package day06_concatination_Operators;

public class C01_Concatination {
    public static void main(String[] args) {

        String str1="Java";
        String str2="guzel";
        int sayi1=5;
        int sayi2=3;

        System.out.println(str1+sayi1+str2);

        System.out.println(sayi1-sayi2+str2+sayi1*sayi2); //2guzel15

        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2)); //Java22

        System.out.println(sayi1+(sayi2+str2)); //hiclik kullanarakta yapabiliriz daha kolay  ""+ sayi yapariz

        System.out.println(""+sayi1+sayi2+str2);




    }
}
