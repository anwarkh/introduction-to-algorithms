package chapter4;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Exercice_4_1_2 {
    public static void main(String[] args) {
        //
        //        int[]  A = IntStream.generate(() -> ThreadLocalRandom.current().nextInt(-100, 100)).limit(100).toArray();
        //        System.out.println(Arrays.toString(A));
        int[] A = new int[]{-34, 94, -17, -53, 72, -63, -37, -33, 13, -76, 82, 99, -80, -70, 20, 10,
                -94, -2, -68, 70, -29, 43, -84, -77, 84, -22, 9, 4, -54, 11, 33, 99, 98, -90, 69, 32,
                -19, -43, 15, -91, 26, 84, -14, -34, 88, 81, -8, 85, -12, -11, -86, 55, -38, 28, 60,
                -33, 37, -99, -41, -60, 77, 91, 17, 37, -3, -71, -28, -48, 69, -32, 11, -93, 69,
                28, 20, -77, 94, -90, -40, -56, -37, 24, -21, -7, 32, 75, -4, 15, 18, 55, -98, 18,
                -75, 1, -57, -78, 60, -95, -44, -59};

        Result result = new Result(0, 0, A[0]);
        if (A.length > 1) {

            for (int i = 1; i < A.length; i++) {
                for (int j = i + 1; j < A.length; j++) {
                    {
                        int sum = A[i] + A[j];
                        if (result.sum < sum) {
                            result = new Result(i, j, sum);
                        }
                    }
                }
            }
        }
        System.out.println(result);

    }

    static class Result {
        int low;
        int hight;
        int sum;

        public Result(int low, int hight, int sum) {
            this.low = low;
            this.hight = hight;
            this.sum = sum;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "low=" + low +
                    ", hight=" + hight +
                    ", sum=" + sum +
                    '}';
        }
    }
}
