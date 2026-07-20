package util;

public class AccountNumberGenerator {

    private static int currentNumber = 1000;

    private AccountNumberGenerator() {
        // Prevent object creation
    }

    public static String generateAccountNumber() {
        currentNumber++;
        return "ACC" + currentNumber;
    }

    public static void setCurrentNumber(int number) {
        if (number > currentNumber) {
            currentNumber = number;
        }
    }

    public static int getCurrentNumber() {
        return currentNumber;
    }
}
