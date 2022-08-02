public class Main {
    public static void main(String[] args) {
        int[] weights = {90, 92, 241, 42, 52, 25, 35, 0, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeights = weights[0];
        System.out.println(januaryWeights);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        System.out.println(weights[1]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

        // Задание 1
        int[] namber = new int[]{1, 2, 3, 4, 5, 6, 7,};
        float[] fraction = new float[]{1.57f, 7.654f, 9.986f};
        double[] freeArray = new double[]{1.3453463634676544, 2.345346346};

        // Задание 2
        System.out.println(namber[0] + "," + namber[1] + "," + namber[2]);
        System.out.println(fraction[0] + "," + fraction[1] + "," + fraction[2]);
        System.out.println(freeArray[0] + "," + freeArray[1]);

        //Задание 3
        System.out.println(namber[2] + "," + namber[1] + "," + namber[0]);
        System.out.println(fraction[2] + "," + fraction[1] + "," + fraction[0]);
        System.out.println(freeArray[1] + "," + freeArray[0]);

        // Задание 4
        for (int a = namber[0]; a < namber[6]; a = a + 1) {
            if ((a + 1) % 2 == 0) System.out.println(namber[a]);
        }namber[2]= namber[2]+1;
        namber[4]= namber[4] +1;
        namber[6] = namber[6]+1;
    }
}


