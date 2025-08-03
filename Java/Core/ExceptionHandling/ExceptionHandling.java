package Java.Core.ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int age = 16;
        CheckAge ca = new CheckAge(age);
        // if (ca.isEligible()) {

        // } else {
        // System.out.println("No, Not Eligible to Vote");
        // }
        try {
            ca.isEligible();
        } catch (AgeException e) {
            System.out.println(e);
        }
    }
}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class CheckAge {
    private boolean x;

    CheckAge(int age) {
        if (age > 18) {
            x = true;
        } else {
            x = false;
        }
    }

    boolean isEligible() throws AgeException {
        if (x) {
            throw new AgeException("Yes, Eligible to Vote");
        } else {
            throw new AgeException("No, Not Eligible to vote");
        }
    }
}