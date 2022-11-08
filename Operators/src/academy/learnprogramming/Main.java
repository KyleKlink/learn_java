package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;     // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("Previous result = " + previousResult);

        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of 4 / 3 is 1
        System.out.println("The remainder of 4 / 3 is " + result);


        // Short-hand operators

        result++;  // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);


        // Conditional Logic

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien.");
        }

        isAlien = true;
        if (isAlien) {
            System.out.println("It is alien.");
        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        topScore = 90;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        // ! is known as the logical complement operator and can only be used on booleans.


        // Ternary operator
        // Basically a shortcut of the if-then-else statement

        boolean isCar  = false;
        if (isCar) {
            System.out.println("This is a car.");
        }

        boolean wasCar = isCar ? true : false;

        if (!wasCar) {
            System.out.println("Was car is not true.");
        }


        // CHALLENGE

        double myDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double total = (myDouble + mySecondDouble) * 100.00d;
        double remainder = total % 40.00d;

        boolean isAnswerZero = remainder == 0 ? true : false;
        System.out.println("Value of isAnswerZero is " + isAnswerZero);

        if (!isAnswerZero) {
            System.out.println("Got some remainder.");
        }

    }

}
