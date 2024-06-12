import java.util.Scanner;

public class pythagoreosTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Numbers -");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((int)Math.pow(a, 2) + (int)Math.pow(b, 2) == (int)Math.pow(c, 2))
        {
            System.out.println(true);

        }
        else if ((int)Math.pow(b, 2) + (int)Math.pow(c, 2) == (int)Math.pow(a, 2)) {
            System.out.println(true);
        }
        else if ((int)Math.pow(a, 2) + (int)Math.pow(c, 2) == (int)Math.pow(b, 2)){
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
