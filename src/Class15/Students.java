package Class15;

public class Students {

    String name;

    String id;

    int numberOfStudents;

    public static void main(String[] args) {

        Students obj=new Students();
        obj.name="luis";
        obj.id="a45d4";
        obj.numberOfStudents=2;


        Students obj2=new Students();
        obj2.name="tom";
        obj.id="a8d8d5";
        obj2.numberOfStudents=2;

        Students obj3=new Students();
        obj3.name="tim";
        obj3.id="fgdgfd66";
        obj3.numberOfStudents=2;

        System.out.println("number of students are "+(obj.numberOfStudents+obj2.numberOfStudents+obj3.numberOfStudents));

    }

}
