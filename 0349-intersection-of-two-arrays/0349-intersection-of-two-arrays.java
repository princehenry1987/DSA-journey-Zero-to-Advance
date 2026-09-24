class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //brite force
        HashSet<Integer> set = new HashSet<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        for(int i=0;i<n1;i++){
           for(int j=0;j<n2;j++){
               if(nums1[i]==nums2[j]){
                   set.add(nums1[i]);
               }
            }
       }
       int result[]= new int[set.size()];
       int index =0;
       for(int num :set){
        result[index++]=num;
       }
       return result;
        
    }
}