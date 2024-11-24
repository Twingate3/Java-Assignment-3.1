public class DaysInMonth {
    public static void main(String[] args) {
        System.out.println("Enter the month (1-12): ");
        int month = Integer.parseInt(System.console().readLine());

        System.out.println("Enter the year: ");
        int year = Integer.parseInt(System.console().readLine());

        int days;

        if (month == 2) {
            // February: Check for leap year
            days = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            // Months with 30 days
            days = 30;
        } else if (month >= 1 && month <= 12) {
            // Months with 31 days
            days = 31;
        } else {
            System.out.println("Invalid month entered.");
            return;
        }

        System.out.println("The number of days in " + month + "/" + year + " is: " + days);
    }
}
