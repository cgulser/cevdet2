package day23_arraysPraxis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C05_Sorular {
    public static void main(String[] args) {
        //1) Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
        // 2) indexsiz add() methodunu kullanarak, B’yi ekleyiniz. index’li add() methodunu kullanarak,
        // L’yi 1 numarali index’e ekleyiniz. ArrayList’i ekrana yazdiriniz,
        // list goyle olmali; A, L, C, E, F, B. [A, L, C, E, F, B]
        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("C");
        harfler.add("E");
        harfler.add("F");
        harfler.add("B");
        harfler.add(1,"L");
        System.out.println(harfler);
        //
        // 3) set() methodu kullanarak, E’yi D yapiniz.
        // ArrayList’i ekrana yazdiriniz,
        // list goyle olmali; A, L, C, D, F, B. [A, L, C, D, F, B]
        //
        // 4) remove() methodu kullanarak,
        // F’yi siliniz. ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
        List<String>logList=new ArrayList<>();
        logList.add (harfler.set(3,"D"));
        System.out.println(harfler);
        boolean sonuc=harfler.remove("F");
        if (sonuc==true){
            System.out.println("Istediginiz harf silindi");
        }
        System.out.println(harfler);
        System.out.println("Degistirilen degerler : "+logList);
        // 5) sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        //ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.
        Collections.sort(harfler);
        System.out.println("Sort methodu"+harfler);
        //
        // 6) contains() methodu kullanarak, L’nin list’de var oldugunu
        // ve M’nin list’de var olmadigini dogrulayiniz.
        boolean sonuc2=harfler.contains("L");
        if (sonuc2==true){
            System.out.println("Aradiginiz deger "+"L "+" listede mevcuttur");
        }else{
            System.out.println("Aradiginiz deger "+"L "+" listede yer almamaktadir");
        }
        sonuc2=harfler.contains("M");
        if (sonuc2==true){
            System.out.println("Aradiginiz deger "+"M "+" listede mevcuttur");
        }else{
            System.out.println("Aradiginiz deger "+"M "+" listede yer almamaktadir");
        }
        //
        // 7) size() methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz.

        harfler.size();



        // 8) clear() methodu kullanarak, list’deki tum elemanlari siliniz.
        //
        // 9) isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz
    }
}


