package Class9HW;

public class Task7 {  public static void main(String[] args) {
    int[] numbers = {10,20,50,40,30};
    int largest=numbers[0];
    for (int num:numbers) {
        if (num>largest){
            largest=num;
        }

    }
    System.out.println(largest);

}
}
