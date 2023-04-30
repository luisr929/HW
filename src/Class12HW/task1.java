package Class12HW;

public class task1 {
    public static void main(String[] args) {


        String string = "wasup";

        if (!string.isBlank() && string.length() >= 3 && string.length() % 2 == 1) {
            int middleIndex = string.length() / 2;
            char middleChar = string.charAt(middleIndex);
            System.out.println(middleChar);


        }


    }
}

