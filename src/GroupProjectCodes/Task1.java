package GroupProjectCodes;

public class Task1 {
    public static void main(String[] args) {
        int low = 100;
        int high = 0;

        int[] temperatures = {70, 80, 90, 20, 30, 40, 71};
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > high) {
                high = temperatures[i];
            }

            if (temperatures[i] < low) {
                low = temperatures[i];
            }

        }
        System.out.println(high);
        System.out.println(low);

    }
}







