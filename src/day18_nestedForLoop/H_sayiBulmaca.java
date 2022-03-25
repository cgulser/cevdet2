package day18_nestedForLoop;
import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Random rnd=new Random();
        int rastGele=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur

        Scanner scan = new Scanner(System.in);
        int tahmin = 0;
        int sayac = 1;

        while (tahmin != rastGele) {
            System.out.println("Lutfen tahmin edilmesi istenen sayiyi giriniz : ");
            tahmin = scan.nextInt();
            if (tahmin < rastGele) {
                System.out.println("Lutfen daha buyuk sayi giriniz!");


            } else if (tahmin >rastGele){
                System.out.println("lutfen daha kucuk bir sayigiriniz!");


            }
            sayac++;

        }
        System.out.println("** Tebrikler sayiyi buldunuz **"+"\n"+"Toplam tahmin sayisi : "+(sayac-1));

    }
}





