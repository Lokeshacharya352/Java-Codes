import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class rotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        System.out.println("Enter the number by which you want to rotate : ");
        int k = sc.nextInt();
       
        //int l = String.valueOf(num).length();
        int l =0;
        int temp =num;
        while (temp >0) 
    {   temp /=10;
        l++;
            
        }
        
        k=k %l;  // if rotate a number  by large number then divide that by its multiplier which is length
        if (k<0)
        {
            k=k+l;  // if rotate a number by negative value
        }
        int rotate = (int)num % (int)Math.pow(10, k);
        

        rotate = (int) rotate * (int)Math.pow(10, l-k) ;
        
        int quotient = (int) num / (int)Math.pow(10,k);
        
        rotate = rotate +quotient;
 
        System.out.println("Rotate the number by "+ k + " is :"+ rotate);
        


    }
}
