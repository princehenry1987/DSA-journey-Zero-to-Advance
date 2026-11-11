class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        Arrays.sort(nums);
        
        int count =0;
        int min =Integer.MIN_VALUE;
        int lar=1;
        for(int i=0;i<n;i++){
            if(nums[i]-1 == min){
                count+=1;
                min = nums[i];
            }else if(min != nums[i]){
                count =1;
                min = nums[i];
            }
            lar = Math.max(lar,count);
        }
      return lar; 
    }
}