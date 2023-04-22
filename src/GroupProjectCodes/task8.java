package GroupProjectCodes;

public class task8 {
    public static void main(String[] args) {


        int[]num = {1,2,3,4,5};
        int max =num[0];
        int min = num[0];

        for (int i = 0; i <num.length ; i++){
            if (num[i]<min){
                min=num[i];
            }

            if (num[i]>max){
                max=num[i];
            }

                }
        System.out.println(max);
        System.out.println(min);

            }

        }


