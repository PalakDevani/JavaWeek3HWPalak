package javaprogrammeclass3week7;
//16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”

import java.util.Scanner;

public class Program_16_P_PosiNegaZero {
    public static void main(String[] args) {
        Program_16_P_PosiNegaZero obj = new Program_16_P_PosiNegaZero();
        obj.numberCheck();
    }
    public void numberCheck() {
        int num;
        //Scanner class to read value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        num = scanner.nextInt();
        //check condition for +ve, -ve and Zero
        if (num > 0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if (num < 0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println("IT's ZERO.");
        scanner.close();
    }
}

