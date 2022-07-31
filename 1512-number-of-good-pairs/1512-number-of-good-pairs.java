class Solution {
    public int numIdenticalPairs(int[] nums) {
        int gp = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j =0; j<nums.length;j++){
                if(i<j && nums[i]==nums[j]){
                    gp++;
                }
            }
        }
        return gp;
        
    }
}