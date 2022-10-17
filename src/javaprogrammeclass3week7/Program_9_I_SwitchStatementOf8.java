package javaprogrammeclass3week7;
// . Same as above program-8 using switch statement.

import java.util.Scanner;

public class Program_9_I_SwitchStatementOf8 {
    public static void main(String[] args) {
        myCityName();
    }
    public static void myCityName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter String Name ");
        String input = scanner.next();
        switch (input) {
            case "a":
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "b":
            case "B":
                System.out.println("Bangalore");
                break;
            case "c":
            case "C":
                System.out.println("Chennai");
                break;
            case "d":
            case "D":
                System.out.println("Delhi");
                break;
            case "e":
            case "E":
                System.out.println("Edinburgh");
                break;
            case "f":
            case "F":
                System.out.println("Fatehpur");
                break;

            default:
                System.out.println("Invalid Entry");
                scanner.close();
        }
    }

}
