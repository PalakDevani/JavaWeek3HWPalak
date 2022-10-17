package javaprogrammeclass3week7;
// 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;

public class Program_2_B_FindingLeapYearOrNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input the Year: ");
        int year = scanner.nextInt();

        boolean a = (year % 4) == 0; // Rational Operator '==' Means Equal: Verifies if both operands are equal.
        boolean b = (year % 100) != 0; // Rational Operator '!=' Means Not Equal: to verify if both operands are not equal.
        boolean c = ((year % 100 == 0) && (year % 400 == 0));  // Logical Operator: '&&' named Logical- Logical AND returns true if both operands are true. Returns false if one or both operands are false.

        if (a && (b || c)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }



    }
}
