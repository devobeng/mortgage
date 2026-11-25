package mortgage;

public class Main {
    public static void main(String[] args) {
        int principal = 1_000_000;
        float annualInterest = 3.92f;
        byte years = 30;

        var calculator = new Mortgage(principal, annualInterest, years);
        calculator.printPaymentSchedule();
    }
}