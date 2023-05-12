package Class20;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */


    double interest;
    double balance;

    double apr(double interest,double balance) {
        double total = 0;
       return total=interest * balance;



    }

    public static void main(String[] args) {
        CreditCard card=new CreditCard();
      double total=  card.apr(4.0,1500);
        System.out.println(total);
    }
}