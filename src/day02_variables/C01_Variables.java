package day02_variables;

public class C01_Variables {

    public static void main(String[] args) {


        /* Bir variable olustururken icerisine koyacagim datanin olabilecegi degerlere uygun
        bir data turu secmeliyiz.
        örnegin bir sehrin nufusundan bahsediyorsak
        variable'mizin data turu String, boolean , char , vaya double olamaz.
        geriye kalan tam sayi turlerinden sehrin nufusu icine alabilecek buyuklukte bir data turu secebiliriz
        biz kurs boyunca genelde tam sayilar icin int, ondalikli sayilar icin double kullanacagiz.
         */

        System.out.println(   "Hello World yazdiran Java yi hallleder"     );

        int level=1;
        System.out.println(level);

        boolean ogrenciMi=true;

        boolean yagisVarMi=false;


        // char degerleri yazarken hatalar aldim
        //Parantez fazlasi ve tek tirnak hatasi varmis, hatalar kaldirildi


        char ozelSembol='?';

        char sayi='3';

        char harf='c';

        System.out.println(ozelSembol);


    }
}
