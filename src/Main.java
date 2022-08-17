public class Main {
    public static void main(String[] args) {
       /* int[] weights = {90, 92, 241, 42, 52, 25, 35, 0, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeights = weights[0];
        System.out.println(januaryWeights);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        System.out.println(weights[1]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);*/


        // Задание 1
        int[] ints = new int[]{1, 2, 3};
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
        }
        double[] doubles = {1.57, 7.654, 9.986};
        boolean[] booleans = {true, false};

        // Задание 2
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
            if (i < ints.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i]);
            if (i < doubles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < booleans.length; i++) {
            System.out.print(booleans[i]);
            if (i < booleans.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задание 3
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doubles.length - 1; i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = booleans.length - 1; i >= 0; i--) {
            System.out.print(booleans[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задание 4
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                ints[i] = ints[i] + 1;
            }
            System.out.print(ints[i]);
            if (i < ints.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        // Задание 5
        int[][] matrix = new int[3][3];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                if (row == column || row == (matrix.length - 1 - column)) {
                    matrix[row][column] = 1;
                } else {
                    matrix[row][column] = 0;
                }
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }


        // Задание 6
        int[] arr1 = new int[]{5, 4, 3, 2, 1};
        for (int y = 0; y < arr1.length; y++) {
            System.out.print(arr1[y] + " ");
        }
        System.out.println();


        //Задание 7


        // Задание 8
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i : arr) {
            for ( int j:arr){
                if( i+j ==-2){
                    System.out.println(j + " ,"+i);
                }else break;
            }
        }



        // Задание 9
        int[] arr0 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i : arr0) {
            for ( int j:arr0){
                if( i+j ==-2){
                    System.out.println(j + " ,"+i);
                }
            }
        }



        }


    }









