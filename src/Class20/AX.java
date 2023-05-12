package Class20;

public class AX extends CreditCard{
    @Override
    double apr(double interest, double balance) {
        double total=0;
        return interest/2*balance;
    }

    public static void main(String[] args) {
        AX ax=new AX();
        double total=ax.apr(5.0,1500.0);
        System.out.println(total);
    }
}
