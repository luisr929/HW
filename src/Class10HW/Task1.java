package Class10HW;

public class Task1 {
    public static void main(String[] args) {
        String [][] studentsGrades = {
                {"Taco", "Buster", "Muffins", "Jubilee"},
                {"A", "B", "A", "B"}
        };
        for (int i=0; i< studentsGrades[0].length; i++) {
            if (studentsGrades[1][i].equals("A")) {
                System.out.println(studentsGrades[0][i]+" got an A grade.");
            } else if (studentsGrades[1][i].equals("B")){
                System.out.println(studentsGrades[0][i]+" got a B grade.");
            }
        }
    }
}

