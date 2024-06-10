import java.net.Socket;
import java.util.Scanner;

import javax.security.sasl.SaslException;

public class gcdandLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int on1=n1;
        int on2=n2;
        int rem=0;
        while(n1%n2 !=0){
            rem = n1 % n2;
            n1=n2;
            n2=rem;
        }

        int gcd = n2;

        int lcm = (on1 * on2)/gcd;

        System.out.println("Gcd of the two number is : "+ gcd );
        System.out.println("LCM of the two number is : "+ lcm );

    }
}
