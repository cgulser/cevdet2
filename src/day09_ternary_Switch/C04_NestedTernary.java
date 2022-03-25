package day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {

        // verilen sayinin pozotif ya da negatif oldugunu kontrol edip
        //0 veya pozitif ise tek veya cift
        //negatif ise 100 den buyuk veya kucuk
        //oldugunu belirleyen bir ternary yaziniz

        int sayi=10;


        if (sayi>=0){

            if (sayi%2==0){
                System.out.println("Sayi pozitif cift sayi");

            }else {
                System.out.println("Sayi pozitif tek sayi");
            }


        } else {
            if (sayi<=-100){
                System.out.println("sayi -100 den kucuk negatif");
            }else {
                System.out.println("sayi -100 den buyuk negatif");
            }

        }


        String sonuc= sayi>=0 ? (sayi%2==0 ? "Dogruysa cift sayi" : "pozitif tek sayi") :
                (sayi<-100 ? "-100 den kucuk negatif sayi" : "-100 den buyuk negatif sayi" );



    }
}
