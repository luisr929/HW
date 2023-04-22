package GroupProjectCodes;

public class task9 {
    public static void main(String[] args) {


        int[] numbers = {2, 3, 4, 5};
        int most = 0;
        int second = 0;
        for (int number : numbers) {

            if (number > most) {

                second = most;

                if (number > second) {

                    most=number;



                }


            }



        }System.out.println(second);
    }
}




