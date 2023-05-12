package Class20;

public class Degree {
    /*
    Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
     */

    void getPrerequisite(){
        System.out.println("to get a degree you need high school diploma");
    }

    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();
        Masters master=new Masters();
        master.getPrerequisite();

    }
}
