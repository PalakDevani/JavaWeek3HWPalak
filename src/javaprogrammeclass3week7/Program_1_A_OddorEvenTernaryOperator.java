package javaprogrammeclass3week7;
// 1. Write a java program that tells us that Input number is odd or even?
// HINT: use ternary operator (? :)

import java.util.Scanner;

public class Program_1_A_OddorEvenTernaryOperator {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter number to test");
        int number = scanner.nextInt();
        scanner.close();

        //Ternary operator to check number
        String result = number%2==0? "Even" : "Odd"; // need to understand why % sign used
        System.out.println(number + " is " + result);
    }
}
