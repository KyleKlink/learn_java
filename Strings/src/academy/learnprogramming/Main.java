package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("My string is = " + myString);
        myString = myString + " and more content, too";
        System.out.println("my string is = " + myString);

        // Plus operator with strings, even when numbers, still results in a stting
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("Numberstring is " + numberString);

        // Integers can be added to strings, the int will be cast to a string
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        // Strings are immutable. They cannot be changed once created.
        // When "modifying" a string a completely new string is created and the old is dropped.
        // Thus, appending to strings with + is not efficient; StringBuffer should be used.

    }

}
