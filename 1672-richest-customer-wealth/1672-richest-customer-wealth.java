class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int max =0;
        int[] wealth = new int[accounts.length];
        for(int i=0;i<accounts.length; i++){
            for(int j =0; j<accounts[i].length;j++){
                sum+=accounts[i][j];
                wealth[i] = sum;
            }
            sum =0;
        }
        for(int i =0;i<wealth.length;i++){
            if(wealth[i]>max){
                max = wealth[i];
            }
        }
        return max;
    }
}