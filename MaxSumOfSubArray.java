public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] arr = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArraySum(arr);
        System.out.println("Maxum sum of sub-Array is: "+res);
    }

    static int maxSubArraySum(int[] nums) {
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;
        for(int num : nums) {
            localMax = Math.max(num, localMax+num);
            globalMax = Math.max(globalMax, localMax);
            if(localMax < 0)    localMax = 0;
        }
        return globalMax;
    }
}
