package gr.aueb.cf.ch1;

import java.util.Scanner;

/** Μετατρέπει μέρες , ώρες , λεπτά σε συνολικά δευτερόλεπτα.
 * Ο χρήστης θα δίνει τα δεδομένα
 * και θα εκτυπώνεται το συνολικό αποτέλεσμα
 */

public class DateTimeToSecondsConverter {
    public static void main(String[] args) {
    final int SEC_PER_DAY = 3600 * 24;
    final int SEC_PER_HOUR = 3600;
    final int SEC_PER_MIN = 60;

    Scanner in = new Scanner(System.in);
    int inputDays;
    int inputHours;
    int inputMinutes;
    int inputSeconds;
    int totalSeconds = 0;

    System.out.println("Please insert days , hours , minutes , seconds");
    inputDays = in.nextInt();
    inputHours = in.nextInt();
    inputMinutes = in.nextInt();
    inputSeconds = in.nextInt();

    totalSeconds = inputDays * SEC_PER_DAY + inputHours * SEC_PER_HOUR
            + inputMinutes * SEC_PER_MIN + inputSeconds;

    System.out.printf("Total Seconds: %,d seconds \n");




    }
}
