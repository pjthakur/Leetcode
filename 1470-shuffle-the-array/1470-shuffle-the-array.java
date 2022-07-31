class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[2*n];
        for(int i= 0; i<n;i++){
            
            array[i*2] = nums[i];
            
            array[(i*2)+1] = nums[i+n];
            
        }
        return array;
        
    }
}