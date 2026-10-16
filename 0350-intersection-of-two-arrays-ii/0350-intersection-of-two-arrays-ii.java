class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int num:nums2){
            list.add(num);
        }
         List<Integer> intersectionlist = new ArrayList<>();
        for(int num:nums1){
          if(list.contains(num)){
                intersectionlist.add(num);
                list.remove(Integer.valueOf(num));
            }
        }
         int result[]= new int[intersectionlist.size()];
         int index=0;
         for(int num:intersectionlist){
            result[index++] =num;
         }
         return result;
    }
}