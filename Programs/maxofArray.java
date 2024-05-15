public class maxofArray {
    public static void main(String[] args) {
        int [] numbers = {-12,-1,-34,-2200,-87};
        int max = Integer.MIN_VALUE; //if all the values is negative then 0 will not work we have to take smallest integer which is Integer.Min_Value 
        
        int min =Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if(max < numbers[i])
            {
               max = numbers[i];
            }
        
        }
        System.out.printf("Maximum value in this array is %d .", max);
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if(min > numbers[i])
            {
               min = numbers[i];
            }
            
        }
        System.out.printf("Minimum value in this array is %d .", min);

    }
    }
    

