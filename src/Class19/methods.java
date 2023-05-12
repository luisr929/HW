package Class19;

public class methods {
    private void print(){
        System.out.println("wassup");
    }
    private void print(String a){
        System.out.println(a);
    }
    private void print(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        methods meth=new methods();
        meth.print();
        meth.print(1);
        meth.print("java");
    }
}
