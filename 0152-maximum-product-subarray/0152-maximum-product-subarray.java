class Solution {
    public int maxProduct(int[] nums) {
        int maxproduct =nums[0];
       for(int i=0;i<nums.length;i++){
        int crrproduct = 1;
         for(int j=i;j<nums.length;j++){
            crrproduct*=nums[j];
         
         if(maxproduct<crrproduct){
            maxproduct=crrproduct;
         }
        }
       }
        return maxproduct;
    }
}