package day03_scanner;

public class C02_swapVariables {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        System.out.println("Swap'tan once sayi1: " + sayi1+ ", sayi2: " + sayi2);

        int temp=sayi1;
        sayi1=sayi2;

        sayi2=temp;

        System.out.println("Swap'tan sonra sayi1: " + sayi1+ ", sayi2: " + sayi2);

    }
}
