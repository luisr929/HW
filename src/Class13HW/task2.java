package Class13HW;

public class task2 {


    boolean isPalindrome(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        boolean isStrPalindrome = false;
        if (str.equalsIgnoreCase(reversedStr)) {
            isStrPalindrome=true;
        }
        return isStrPalindrome;
    }

    public static void main(String[] args) {
        task2 obj=new task2();
        boolean result=obj.isPalindrome("car");
        System.out.println(result);
    }
}












