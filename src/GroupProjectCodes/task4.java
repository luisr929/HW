package GroupProjectCodes;

public class task4 {
    public static void main(String[] args) {


        int sum = 0;
        int sum1=0;

        int[][] num = {
                {1, 2, 3},
                {2, 3, 4},
                {5, 6, 7}
        };
        for (int[] ints : num) {
            for (int anInt : ints) {
                if (anInt % 2 == 0) {
                    sum = anInt + sum;
                }
                if (anInt%2!=0){
                    sum1=anInt+sum1;

                }

            }


        }
        System.out.println(sum);
        System.out.println(sum1);

    }
}

