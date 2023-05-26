package GroupProject2;

interface Shape {


    /*
    Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.
     */




    void calculatedArea(int a);

    void calculatePermiter(int a);



}
class Circle implements Shape{


    @Override
    public void calculatedArea(int radius) {
        System.out.println(Math.PI*(radius*radius));
    }

    @Override
    public void calculatePermiter(int radius) {
        System.out.println(2*Math.PI+radius);
    }
}
class Square implements Shape{



    @Override
    public void calculatedArea(int side) {
        System.out.println(side*side);

    }

    @Override
    public void calculatePermiter(int side) {
        System.out.println(4*side);
    }
}
