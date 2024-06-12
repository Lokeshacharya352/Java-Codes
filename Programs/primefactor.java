import java.util.Scanner;

public class primefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number - ");
        int num = sc.nextInt();
        /*  Brute force - 
         * for (int i = 2; i <= num ; i++) {
            while (num % i == 0) 
            {
                num = num /i;
                System.out.println(i);
            }
         }
            
         */
        
        

        //Optimized approach is to use the prime number rule pq < = num;
        for (int i = 2; i * i <= num ; i++) {
            while (num % i == 0) 
            {
                num = num /i;
                System.out.println(i);
            }
            
        }
        if(num !=1)
        {
            System.out.println(num);
        }

    }
}
