package GroupProjectCodes;

public class task7 {
    public static void main(String[] args) {
        int [] num=new int[10];
        num[0]=0;
        num[1]=1;

        for (int i = 2; i <num.length ; i++) {
            num[i]=num[i-1]+num[i-2];
        }
        for (int i : num) {
            System.out.println(i);

        }
    }
}
