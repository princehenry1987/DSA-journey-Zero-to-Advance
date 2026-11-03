class Solution {
    public int minMoves(int[] nums) {
        int moves =0;
        int greatest= nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>greatest){
                greatest= nums[i];
            
            }
        }
        for(int i=0;i<nums.length;i++){
           moves+= greatest-nums[i];
            
        }
    return moves;
    }
}