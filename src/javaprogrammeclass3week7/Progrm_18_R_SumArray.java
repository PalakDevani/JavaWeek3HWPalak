package javaprogrammeclass3week7;
//18. Write a Java program to sum values of an array.


import java.util.Scanner;

public class Progrm_18_R_SumArray {
    public static void main(String [] args){
        Progrm_18_R_SumArray obj = new Progrm_18_R_SumArray();
        obj.sum();
    }
    public void sum(){
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("The sum is " + sum);
    }

}
