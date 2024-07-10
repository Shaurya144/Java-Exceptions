public class Main {

    // The throw Keyword
    // throw statement is used together with an exception type

    // Eg
    static void checkAge(int age) {
        if (age < 16) {
            throw new ArithmeticException("Access denied - You must be at least 16 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    // Java Exceptions are used to prevent the code from completely stopping if an
    // error occurs
    // for example the Try and Catch keywords

    public static void main(String[] args) {
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]);
        } catch (Exception e) { // if there is an error
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        // The catch loop will run because there is no tenth index
        // the Finally code will always run regardless of the result

        checkAge(15);
    }
}