package Class14;

public class PrimeTask {
    boolean isPrime(int num){
        boolean isPrime=true;
        int count=0;
        for (int i = 2; i <=num ; i++) {
            if (num%i==0){
                count++;
                break;

            }
            if (count >1){
                isPrime=false;
            }
        }
        return isPrime;
    }
}
