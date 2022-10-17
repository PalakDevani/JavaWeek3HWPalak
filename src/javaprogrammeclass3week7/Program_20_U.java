package javaprogrammeclass3week7;

public class Program_20_U {
    public static void main(String [] args){
        Program_20_U obj = new Program_20_U();
        obj.array();
    }
    public void array() {

        int[] num = {1, 2, 4, 5, 6, 7, 8, 9};
        int toFind = 3;
        boolean found = false;
        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
        if (found){
            System.out.println(toFind + " is found.");
        }else{
            System.out.println(toFind + " is not found.");
        }
    }

}
