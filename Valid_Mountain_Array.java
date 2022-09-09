public class Valid_Mountain_Array {
    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[] {1,2,3,4,5,3,2,1}));
        System.out.println(validMountainArray(new int[] {1,2,3,4,5,3,3,1}));
    }    
    private static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if( n < 3 )    return false;
        int i = 0, j = n-1;
        while(i < n-1 && arr[i] < arr[i+1])    i++;
        while(i > 0 && arr[j] < arr[j-1])    j--;
        return i > 0 && i == j && j < n-1;
    }
}
