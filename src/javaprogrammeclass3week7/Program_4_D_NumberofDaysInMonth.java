package javaprogrammeclass3week7;
/*Number of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
*/


import java.util.Scanner;

public class Program_4_D_NumberofDaysInMonth {
    public static void main(String[] args) {
        isLeapYear(2000);
        getDayinMonth(1, 2012);
    }

    public static void isLeapYear(int year) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        year = input.nextInt();
        boolean isleap = false;
        if (year >= 1 && year <= 9999 && year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isleap = true;
                else
                    isleap = false;
            } else
                isleap = true;
            } else {
                isleap = false;
            }

        if (isleap == true) {
                System.out.println(year + " is a Leap Year. ");
            } else {
                System.out.println(year + "is not a leap Year ");
            }

        }
        public static int getDayinMonth ( int month, int year){
            Scanner input = new Scanner(System.in);

            int number_of_DaysInMonth = 0;
            String MonthofName = "Unknown";
            System.out.print("Input a month number: ");
            month = input.nextInt();
            System.out.println("Input a year: ");
            year = input.nextInt();

            switch (month) {
                case 1:
                    MonthofName = "January";
                    number_of_DaysInMonth = 31;
                    break;
                case 2:
                    MonthofName = "February";
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        number_of_DaysInMonth = 29;
                    } else {
                        number_of_DaysInMonth = 28;
                    }
                    break;
                case 3:
                    MonthofName = "March";
                    number_of_DaysInMonth = 31;
                    break;
                case 4:
                    MonthofName = "Apri";
                    number_of_DaysInMonth = 30;
                    break;
                case 5:
                    MonthofName = "May";
                    number_of_DaysInMonth = 31;
                    break;
                case 6:
                    MonthofName = "June";
                    number_of_DaysInMonth = 30;
                    break;
                case 7:
                    MonthofName = "July";
                    number_of_DaysInMonth = 31;
                    break;
                case 8:
                    MonthofName = "August";
                    number_of_DaysInMonth = 31;
                    break;
                case 9:
                    MonthofName = "September";
                    number_of_DaysInMonth = 30;
                    break;
                case 10:
                    MonthofName = "October";
                    number_of_DaysInMonth = 31;
                    break;
                case 11:
                    MonthofName = "November";
                    number_of_DaysInMonth = 30;
                    break;
                case 12:
                    MonthofName = "December";
                    number_of_DaysInMonth = 31;

            }
            System.out.println(MonthofName + " " + year + " has " + number_of_DaysInMonth + "days\n");
            return number_of_DaysInMonth;
        }
    }




