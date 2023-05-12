package Class20;

public class Visa extends CreditCard{

    @Override
    double apr(double interest, double balance) {
        double total=0;
        return interest+2+balance;

    }

    public static void main(String[] args) {
        Visa visa=new Visa();
        double total=visa.apr(15,7000);
        System.out.println(total);

    }
}
