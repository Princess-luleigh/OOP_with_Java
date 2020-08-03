import java.util.Scanner;

// main class

public class ImperialMetric {

// main method

    public static void main(String[] args) {

// variable declaration

        int minNumber, maxNumber;

        float meter;

        float feetToMeter, inchToMeter;

// scanner class object to take the user input

        Scanner sc = new Scanner(System.in);

// take first minimum number from user

        System.out.println("Enter the minimum number of feet (not less than 0):");

        minNumber = sc.nextInt();

// take second maximum number from user

        System.out.println("Enter the maximum number of feet (not more than 30):");

        maxNumber = sc.nextInt();

// declare a array for inch and feet

        int[] inches = new int[12];

// here we give the size max size of array

        int[] feets = new int[maxNumber];

        System.out.print("   |");

// for loop to print the inch number form 0 to 11

        for (int i = 0; i < 12; i++) {

// %6s format string for spaces

            System.out.print(String.format("%5s", i) + "\"");

        }

// new line

        System.out.println();

// first for loop for rows this loop start with minimum and end with maximum

// value from user input

        for (int i = minNumber; i <= feets.length; i++) {

// print the value 0 to 30

            if (i >= 0 && i <= 9) {

                System.out.print(i + "' | ");

            } else {

                System.out.print(i + "'| ");

            }

// System.out.print(i+"'");

// System.out.print(" | ");

// for loop to calculate the meter value

            for (int j = 0; j < inches.length; j++) {

// convert feet into meter

// 1 meter = 0.3048 meter

                feetToMeter = (float) (i * 0.3048);

// convert inch into meter

// 1 inch = 0.0254 meter

                inchToMeter = (float) (j * 0.0254);

// add the feet and inch value to get the meter value

                meter = feetToMeter + inchToMeter;

// format and print the meter value to 3 decimal place by %.3f

                System.out.printf("%.3f", meter);

                System.out.print(" ");

            }

// new line

            System.out.println(" ");

        }

    }

}
