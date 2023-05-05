package Class16;

public class task1 {
   /*
    Create a method that will take a String as a parameter and returns reversed String.
     Method should be available to all classes within your project and accessible by class name.
    */
    public String reverse(String a){
      StringBuilder obj=new StringBuilder(a);
      return obj.reverse().toString();


        }



    public static void main(String[] args) {
        task1 task=new task1();
       String results= task.reverse("hello");
        System.out.println(results);

    }
}
