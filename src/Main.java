public class Main {
    public static void main(String[] args) {
        int[] weights = {90, 92,241,42,52,25,35,0,0,0,0,0};
        weights[0] = 90;
        int januaryWeights = weights[0];
        System.out.println(januaryWeights);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        System.out.println(weights[1]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0;i< weights.length;i++ ){
            System.out.println(weights[i]);
        }

        // Задание 1
        int[] namber = new int[]{1,2,3};
        float [] fraction = new float []{ 1.57f, 7.654f,9.986f};
        double[] freeArray = {1.3453463634676544, 2.345346346};

        // Задание 2

        namber[0]= 1; namber[1]= 2; namber[2]=3;

        System.out.println(namber[0]);
        System.out.println(namber[1]);
        System.out.println(namber[2]);
        System.out.println(fraction[0]);
        System.out.println(fraction[1]);
        System.out.println(fraction[2]);
        System.out.println(freeArray[0]);
        System.out.println(freeArray[1]);

    }


}