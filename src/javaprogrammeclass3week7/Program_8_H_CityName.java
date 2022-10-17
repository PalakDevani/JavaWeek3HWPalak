package javaprogrammeclass3week7;
// 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should be invalid entry

import java.util.Scanner;

public class Program_8_H_CityName {
    public static void main(String[] args) {

        cityName();
    }

    public static void cityName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Alphabet: ");
        char city = scanner.next().charAt(0);// Reads first alphabet

        if (city == 'a' || city == 'A') {
            System.out.println("Ahmedabad");
        } else if (city == 'b' || city == 'B') {
            System.out.println("Bangalore");

        } else if (city == 'c' || city == 'C') {
            System.out.println("Chandigarh");
        } else if (city == 'd' || city == 'D') {
            System.out.println("Delhi");
        } else if (city == 'e' || city == 'E') {
            System.out.println("Egypt");
        } else if (city == 'f' || city == 'F') {
            System.out.println("France");
        } else {
            System.out.println("Invalid Entry");
        }
        scanner.close();
    }

}
