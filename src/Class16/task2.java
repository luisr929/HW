package Class16;

public class task2 {
    private  String vowels(String a){

        return a.replaceAll("[^aeiouAEIOU]","");

    }

    public static void main(String[] args) {
        task2 obj=new task2();
        System.out.println(obj.vowels("Hello"));
    }

}
