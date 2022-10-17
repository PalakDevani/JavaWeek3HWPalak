package javaprogrammeclass3week7;
// 10.Write a java program to input any two number and ask user to enter their symbol (+, -,/, *) find addition, Subtraction, multiplication and division according to their symbol (using if else)

import java.util.Scanner;

public class Program_10_J_IfElse {
    public static void main(String[] args) {
        Program_10_J_IfElse obj = new Program_10_J_IfElse();
        obj.calculator();
    }

    public void calculator() {
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter the operator you want(+, -, *, /) :");
        ch = scan.next().charAt(0);
        if (ch == '+') {
            System.out.println("\nAddition of " + num1 + "+" + num2 + " = " + (num1 + num2));
        } else if (ch == '-') {
            System.out.println("Substraction of " + num1 + "-" + num2 + " = " + (num1 - num2));
        } else if (ch == '*') {
            System.out.println("Multiplication of " + num1 + "x" + num2 + " = " + (num1 * num2));
        } else if (ch == '/') {
            System.out.print("Division of " + num1 + "/" + num2 + " = " + (num1 / num2));
        } else {
            System.out.print("Operator is not available");

            scan.close();
        }
    }
}