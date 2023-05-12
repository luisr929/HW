package Class19;

public class AreaTester {
    public static void main(String[] args) {
        Area area=new Area();
       double result= area.calculateArea(5);
        System.out.println(result);
        double total=area.calculateArea(5,7);
        System.out.println(total);
    }
}
