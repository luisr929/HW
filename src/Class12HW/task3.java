package Class12HW;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        String name="mary";
        String name1="daniel";

        Scanner input=new Scanner(System.in);
        System.out.println("boy or girl?");
        String baby=input.next();
        if (baby.equals("boy")){
            System.out.println("Suggested baby name "+name1.substring(0,3)+name.substring(2,4));
        }else {
            System.out.println("Suggested baby name "+name.substring(0,2)+name1.substring(3,6));
        }

    }
}


