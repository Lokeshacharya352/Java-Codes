import java.util.Scanner;

public class stringconcate {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("What is Your Name? ");
        String s = str.nextLine();
        System.out.println("Hello " + s + "!, Have a nice day!!");
    }
}
