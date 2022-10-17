package javaprogrammeclass3week7;

//17. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Program_17_Q_NumericStringArray {
    public static void main(String[] args) {
        Program_17_Q_NumericStringArray obj = new Program_17_Q_NumericStringArray();
        obj.myArray();
    }

    public static void myArray() {
        int[] my_array1 = {
                1078, 2035, 1456, 2017,
                1409, 1254, 1684, 2541,
                2015, 1452, 2524};

        String[] my_array2 = {
                "Jira",
                "InteliJ",
                "Postman",
                "Bugzilla",
                "Cucumber"
        };
        System.out.println("Original numeric array : " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));

        System.out.println("Original string array : " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : " + Arrays.toString(my_array2));
    }

}
