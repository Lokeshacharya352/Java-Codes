public class TwoD_Array {
    public static void main(String[] args) {
        // Sum of  Two Matrix using 2-D array

        int [][] mat1= {{1,2,3},
                        {4,5,6}};
        int [][]mat2= {{6,7,8},
                       {4,3,1}};
        int [][] results = {{0,0,0},
                            {0,0,0}};

        for (int i = 0; i < mat1.length; i++)
        {
           for(int j =0; j<mat1[i].length;j++)
           {
             
             results[i][j]= mat1[i][j]+ mat2[i][j];
             System.out.print(results[i][j]+ " ");

           }
           System.out.println();
            
            
        }
    }
}
