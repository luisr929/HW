package GroupProject2;

import java.util.Scanner;

public class Task2 {
    /*
    Check if a String is Palindrome: Determine whether a given string is
    a palindrome, which means it reads the same forwards and
    backward. For example, "madam" is a palindrome.
      */

    String rev="";
    boolean ans=false;

    public boolean isAns(String str){
        for (int i = str.length()-1; i >=0; i--) {
            rev=rev+str.charAt(i);
        }
        if (str.equals(rev)){
            ans =true;
        }
    return ans;
    }
}
class Task2Tester{
    public static void main(String[] args) {
        Task2 tester=new Task2();
        boolean isPalidrome=tester.isAns("racecar");
        System.out.println(isPalidrome);
    }
}
