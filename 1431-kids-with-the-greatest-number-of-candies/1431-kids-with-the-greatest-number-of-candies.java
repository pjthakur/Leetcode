class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> boolArr = new ArrayList<Boolean>(candies.length);
        for(int i =0; i<candies.length;i++){
            if(candies[i] > max){
                max = candies[i];
                
            }
            
        }
        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies>=max){
                boolArr.add(true);
            }
            else{
                boolArr.add(false);
                }
        }
        return boolArr;
    }
}