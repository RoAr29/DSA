class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    result[i] = isMax(nums2, j);
                }
                }
        }
        return result;
    }
    public int isMax(int[] nums2, int index){
        for(int i=index+1; i<nums2.length; i++){
            if(nums2[i] > nums2[index]){
                return nums2[i];
            }
        }
        return -1;
    }
}