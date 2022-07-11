package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // INT PRIMITIVE TYPE - 32 bits space (width 32)
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // Exceeding max value of a primitive type results in an overflow
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));

        // Exceeding min value of a primitive type results in an underflow
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));

        // Underscores can be used in integer values to make them more readable
        int maxIntReadable = 2_147_483_647;


        // BYTE PRIMITIVE TYPE - 8 bits space (width 8)
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);


        // SHORT PRIMITIVE TYPE - 16 bits space (width 16)
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        
        
        // LONG PRIMITIVE TYPE - 64 bits space (width 64)
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);


        int myTotal = (myMinIntValue / 2);

        // Have to cast the value for byte/short as Java treats literals as int by default
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        // Always use an integer unless you have a good reason not to since you'll
        // have to cast to the smaller types as seen above

        // QUIZ ---------------------------
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;

        // No casting needed as value in () assumed to be int which fits fine in long
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println("My answer is: " + myLong);

        // Needs casting because value in () expression assumed to be an int
        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));

    }
}
