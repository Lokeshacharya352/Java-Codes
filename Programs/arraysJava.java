import java.util.Scanner;

public class arraysJava {
    public static void main(String[] args) {
        // Sum of the values in Array
        // int [] marks = {1,2,3,4,5};
        // int sum =0;
        // for (int i : marks) {
        //     sum = sum +i;

            
        // }
        // System.out.println(sum);


        //Q2 Search the value in Array - 
        float [] nums = {34.7f,29.6f,39.3f,77.4f,58.3f};
        Scanner sc = new Scanner(System.in);
        float element = sc.nextFloat();
        boolean isInArray = false;

        for (float f : nums) {
            if(element == f)
            {
                isInArray = true;
                break;

            }
        }

        if (isInArray)
        System.out.println("The value is present in  the array.");
        
        else
        System.out.println("This value is not present in the array.");
       

    }
}
