package day23_arraysPraxis;

public class C01_Arrays {
    public static void main(String[] args) {

        //Soru 1 ) Asagidaki multi dimensional array’in tum elemanlarinin
        // carpimini ekrana yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }

        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        int carpim = 1;
        arrayCarpimi(arr, carpim);
    }

    private static void arrayCarpimi(int[][] arr, int carpim) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(carpim *= arr[i][j]);
            }
        }
        System.out.println("Arrayin sayilarinin carpimi : " + carpim);
    }
}