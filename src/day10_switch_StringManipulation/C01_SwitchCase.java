package day10_switch_StringManipulation;
import java.util.Scanner;
public class C01_SwitchCase {
    public static void main(String[] args) {

        // kullanicidan sayi olarak kacinci ay oldugunu  alip
        // istenen ay ismini yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen haftanin kacinci gunu oldugunu giriniz");
        int ayNo=scan.nextInt();

        // bu soruyu if else ile yapabiliriz ama art arda 12 if else
        // cok kalabalik ve anlasilmasi guc olabilir
        // bunun yerine switch - case yapisini kullanabiliriz

        switch (ayNo){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun numarasi giriniz");

        }

    }
}
