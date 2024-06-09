import java.util.Scanner;

public class inverseofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number -");
    int num = sc.nextInt() ;
    int n, d;
    n=1;
    double inverse =0;
    while(num>0){
        d = num%10;
        double t = Math.pow(10,d-1);

        inverse = (n * t) + inverse;

        n++;
        num/=10;
    }
    System.out.println("Inverse of Number is : " + (int)inverse);
    }
    
    
}
