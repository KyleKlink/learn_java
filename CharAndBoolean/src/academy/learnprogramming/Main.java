package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Char can store a single character, uses 16 bits (width 16)
        // Can store using literal character or using unicode value
        char myChar = 'D';
        char myUnicode = '\u0044';
        char copyright = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicode);
        System.out.println(copyright);


        // Boolean type holds TRUE or FALSE value
        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;
        System.out.println(myTrueBoolean);
        System.out.println(myFalseBoolean);

        boolean isCustomerOverTwentyOne = true;
        
    }
}
