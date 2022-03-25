package day14_stringManipulation;
public class C02_TerstenYazdirma {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi ilk harfi buyuk,
        // digerleri kucuk olarak tersten yazdirin.
        String input="AHme";
        String tersStr= input.substring(3).toUpperCase() +
                input.substring(2,3).toLowerCase()+
                input.substring(1,2).toLowerCase()+
                input.substring(0,1).toLowerCase();
        System.out.println(tersStr);

        String isim="ahmet";
        String tersIsim= isim.substring(4).toUpperCase()+
                isim.substring(3,4)+
                isim.substring(2,3)+
                isim.substring(1,2)+
                isim.substring(0,1);
        System.out.println("tersIsim = " + tersIsim);





    }

}
