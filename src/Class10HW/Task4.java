package Class10HW;

public class Task4 {
    public static void main(String[] args) {
        int [][] numbers={
                {3,4,5},
                {6,7,8},
                {9,10,11}
        };
        int sum=0;
        for (int i = 0; i< numbers.length ; i++) {
            int [] arr1=numbers[i];
            for (int j = 0; j < arr1.length ; j++) {
                System.out.print(arr1[j]+" ");



            }
            System.out.println();


        }
    }
}
