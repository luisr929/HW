package Class10HW;

public class Task3 {
    public static void main(String[] args) {
        String [][] groceryList={
                {"veggies","fruits"},
                {"dairy","sweets"}
        };
        for (int i = 0; i < groceryList.length; i++) {
            String [] arr1=groceryList[i];
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j]+" ");

            }

        }
    }
}
