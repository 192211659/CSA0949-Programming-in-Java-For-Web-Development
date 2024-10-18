public class LeapYearChecker {
    public static void main(String[] args) {
        // Sample inputs
        String[] dates = {
            "04/11/19.47",
            "11/15/1936",
            "31/45/1996",
            "64/09/1947",
            "00/00/2000"
        };
        
        for (String date : dates) {
            checkLeapYear(date);
        }
    }

    public static void checkLeapYear(String date) {
        String[] parts = date.split("/");
        
        if (parts.length != 3) {
            System.out.println("Invalid date format: " + date);
            return;
        }

        int year;
        try {
            year = Integer.parseInt(parts[2].replaceAll("\\D", "")); // Remove any non-digit characters
        } catch (NumberFormatException e) {
            System.out.println("Invalid year: " + parts[2]);
            return;
        }

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Given year is Leap Year");
        } else {
            System.out.println("Given year is Non Leap Year");
        }
    }
}
