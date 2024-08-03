class Solution {
    public int minSwaps(int[] nums) {
        //windowSize count of 1
        int windowSize=0;
        for(int num:nums){
            windowSize+=num;
        }
        //find the zeros in the num
        int curZeros=0;
        for(int i=0;i<windowSize;i++){
            if(nums[i]==0){
                curZeros++;
            }
        }
        //solve the remaing windows
        int minZeros=curZeros;
        int start=0;
        int end=windowSize-1;
        int n=nums.length;
        while(start<n){
            //if remove element is 0 decrement 0 counter
            if(nums[start]==0){
                curZeros--;
            }
            start++;
            end++;
            //if included element is 0 increment 0 counter
            if(nums[end%n]==0){
                curZeros++;
            }
            minZeros = Math.min(minZeros, curZeros);
        }
        return minZeros;
    }
}