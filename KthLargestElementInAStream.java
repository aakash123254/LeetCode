class KthLargest {
    private int k;
    private int[] nums;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.nums=nums;
    }

    public int add(int val) {
        nums = Arrays.copyOf(nums,nums.length+1);
        nums[nums.length-1] = val;
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
