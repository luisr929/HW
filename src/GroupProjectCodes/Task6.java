package GroupProjectCodes;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int number=input.nextInt();
        int counter=0;
        for (int i = 1; i <= number; i++) {
            if (number%i==0){
                counter++;

            }

            }
        if (counter==2){
            System.out.println("Number is prime");
        }else {
            System.out.println("not prime");
        }

        }
    }

