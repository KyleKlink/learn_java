package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //Float is a single-precision number, occupies 32 bits
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);


        // Double is a double-precision number, occupies 64 bits
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        // NOTE: Double is the assumed type for literal decimal numbers
        int myIntValue = 5;
        float myFloatValue = 5.25f; // Needs f to indicate float
        float myCastedFloat = (float) 5.25; // Can also use casting, but f is cleaner
        double myDoubleValue = 5.25;    // Doesn't need d as assumed double


        // Arithmetic Operations using decimal values
        int myInt = 5 / 3;
        float myFloat = 5f / 3f;
        double myDouble = 5d / 3d;
        System.out.println("My Int Value = " + myInt);
        System.out.println("My Float Value = " + myFloat);
        System.out.println("My Double Value = " + myDouble);

        // NOTE: Double is the preferred type to use and it's actually oftentimes
        // more performant than float as chips are often designed to operate on double values


        // CHALLENGE
        double pounds = 200;
        double kilograms = pounds * 0.45359237d;
        System.out.println(pounds + " pounds = " + kilograms + " kilograms.");



    }
}
