class Solution {
    public int findComplement(int num) {
        int len = (int)(Math.log(num) / Math.log(2))+1;
        int msk = (1<<len)-1;
        return msk^num;
    }
}