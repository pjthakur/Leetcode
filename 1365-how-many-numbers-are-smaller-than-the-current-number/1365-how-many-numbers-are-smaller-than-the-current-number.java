class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int sum = 0;
        int[] out = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            for(int j=0;j<nums.length; j++){
                if(nums[i]>nums[j])
                    sum++;
            }
            out[i]=sum;
            sum = 0;
        }
        return out;
        
    }
}