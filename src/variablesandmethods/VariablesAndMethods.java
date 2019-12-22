package variablesandmethods;

public class VariablesAndMethods {
    public static void main(String[] args) {
        // Data Types:
        // Primitive and Non-Primitive
        // Primitive: byte, short, int, long, float, double, char, boolean
        // Non-Primitive: String, Arrays, Interface, Classes

        // Declaration
        // [Data Type] [name of the variable]
        // int numberOfStudents;

        // Initialization
        // [Data Type] [name of the variable] = [value]
        // String firstName = "Sydul";
        // boolean isPresent = true;

        // [access specifier] [return type] [method name] ( [parameters] ) {
        //       //code block
        // }

        // Write a method that prints out all the even numbers
        // from two different numbers
        // ex: num 1 = 20, num 2 = 29
        // prints out: 20, 22, 24, 26, 28
        //printEvenNumbers(25, 2005);

//        double number = 150.55;
//        System.out.println(convertPoundsToKg(number));

        int score = -30;
        System.out.println(getLetterGrade(score));
    }

    public static void printEvenNumbers(int startingPoint, int endingPoint) {
        if (startingPoint < endingPoint) {
            for (int i = startingPoint; i <= endingPoint; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a starting point that is " +
                    "less than the ending point");
        }
    }

    // 1. Write a method that converts pounds to kg
    //    1 pound = 0.454 kg
    //    return type = double
    // 2. Write a method that prints out the grade letter of a score...
    //    ex: 98 -> A
    //    ex: 87 -> B
    //    90+ = A; 80+ = B, 70+ = C, 60+ = D, anything below = F

    public static double convertPoundsToKg(double pounds) {
        return pounds * .454;
    }

    public static char getLetterGrade(double score) {
        char grade = 0;
        if (score < 0 || score > 100) {
            System.out.println("Please give a valid score");
        } else {
            if (score >= 90 && score <= 100) {
                grade = 'A';
            } else if (score >= 80 && score < 90) {
                grade = 'B';
            } else if (score >= 70 && score < 80) {
                grade = 'C';
            } else if (score >= 60 && score < 70) {
                grade = 'D';
            } else {
                grade = 'F';
            }
        }
        return grade;
    }
}