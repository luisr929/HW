package Class19;

public class overload {
    static void print() {
        System.out.println();
    }

    static void print(String a) {
        System.out.println(a);
    }

    static void print(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {


        overload.print();
        overload.print("java");
        overload.print(5);
    }
}