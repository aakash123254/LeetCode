class Solution {
    public boolean canSplit(int[] arr) {

        int n=arr.length;
        int totalSum = 0;
        for(int sum:arr){
            totalSum+=sum;
        }

        if(totalSum%2!=0){
            return false;
        }

        int targetSum = totalSum/2;
        int leftSum = 0;

        for(int num:arr){
            leftSum+=num;
            if(leftSum==targetSum){
                return true;
            }
        }
        return false;
    }
}

