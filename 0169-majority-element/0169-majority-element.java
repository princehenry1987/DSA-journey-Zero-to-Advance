class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
          if(map.get(nums[i])>n/2){
            return nums[i];
          }
         
        }
        return -1;

 //        int maxn =0;
 //          int count=0;
 //          int element = nums[0];
//            for(int i=0;i<nums.length;i++){
//               count =0;
//               for(int j =0;j<nums.length;j++){
//                    if(nums[i]==nums[j]){
//                       count++;
//                           if(count>maxn){
//                                  maxn=count;
//                                   element=nums[i];
//                         }
                      
//                    }
//                }
//           }
//            return element;
     }
  }