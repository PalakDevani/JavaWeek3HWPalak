package javaprogrammeclass3week7;

// 19. Write a Java program to calculate the average value of array elements.


public class Program_19_S {
    public static void main(String [] args){
        averageValue();
    }
    public static void averageValue(){
        int[] numbers = new int[]{10, 15, 18, 35, -18, 65, -108};
        //calculate sum of all array elements
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }

}
