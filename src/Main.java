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
            if ( i < ints.length - 1){
                System.out.print(", ");

            }


        }
    }
}









