import java.util.Scanner;

public class calculatePercentage {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("Marks in Maths : ");
        int maths = marks.nextInt();
        System.out.println("Marks in Science : ");
        int science = marks.nextInt();
        System.out.println("Marks in SS : ");
        int ss = marks.nextInt();
        System.out.println("Marks in English : ");
        int english = marks.nextInt();
        System.out.println("Marks in Hindi : ");
        int hindi = marks.nextInt();

        System.out.print("Your percentage is : ");

        int percentage;
        percentage = (maths + science + ss + english + hindi)/ 5;
        System.out.println(percentage + "%");

        if (percentage > 33){
            System.out.println("Congratulations !! You are Passed !");
        }
        else {
            System.out.println("Don't be Upset, Work Hard and Better Luck next time!!");
        }
    }
    
}
