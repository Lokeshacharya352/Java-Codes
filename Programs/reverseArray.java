public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {1,6,3,7,2};
        int l = arr.length;
        int n= Math.floorDiv(l,2);
        int temp = 0;

        for (int i = 0; i < n; i++) {
            //Swap arr[i] to arr[l-i-1] using temp 
            temp = arr[i];
            arr[i]= arr[l-i-1];
            arr[l-i-1]=temp; 
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
