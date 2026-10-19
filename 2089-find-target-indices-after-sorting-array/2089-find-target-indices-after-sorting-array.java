
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // List<Integer> list = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]>nums[j]){
        //             int temp =nums[i];
        //             nums[i]= nums[j];
        //             nums[j]=temp;
        //         }
        //     }
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         list.add(i);
        //     }
        // }
        int count =0;
        int idx = 0;
        for(int num:nums){
            if(num<target){
                idx++;
            }else if(num==target){
                count++;
            }
        }
         List<Integer> list = new ArrayList<>();
        for(int i=0;i<count;i++){
            list.add(idx+i);
        }
         return list;
    }
}