package Class10HW;

public class Task6 {
    public static void main(String[] args) {
        String [][] countries={
                {"canada","mexico","Us"},
                {"russia","turkey","germany"},
                {"japan","iran","china"},
                {"egypt","kenya","sudan"}
        };
        int sum=0;
        for (String[] arr1:countries) {
            for (String country:arr1) {
                sum++;

            }
        }
        System.out.println(sum);
    }
}
