package Class10HW;

public class Task2 {
    public static void main(String[] args) {
        String [][] cars={
                {"american","german"},
                {"korean","italian"}
        };
        for (int i = 0; i < cars.length ; i++) {
            String [] arr1=cars[i];
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j]+" ");
            }


        }
    }
}
