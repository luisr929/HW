package GroupProjectCodes;

public class Task3 {
    public static void main(String[] args) {
        int[][] num = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int[] ints : num) {
            for (int anInt : ints) {

                if (anInt%2==0){
                    System.out.println(anInt);
                }

            }

        }
    }
}
