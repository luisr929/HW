package GroupProject2;

public abstract class Marks {
    /*
    We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code
     */


    abstract int getPercentage();
}
class A extends Marks{
    int mark1;
    int mark2;
    int mark3;

    public A(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    int getPercentage() {


        return (mark1+mark2+mark3)/3;
    }
}
class B extends A {
    int mark4;

    public B(int mark1, int mark2, int mark3, int mark4) {
        super(mark1, mark2, mark3);
        this.mark4 = mark4;
    }

    @Override
    int getPercentage() {


        return (mark1 + mark2 + mark3 + mark4) / 4;
    }
}
    class MarkTester{
        public static void main(String[] args) {
            A obj=new A(45,45,89);
            int results=obj.getPercentage();
            System.out.println(results);
            B obj1=new B(45,78,96,100);
            int results1=obj1.getPercentage();
            System.out.println(results1);
        }
    }


