class Solution {
    public int splitArray(int[] nums, int k) {

        int start =0;
        int end =0;

        for(int i=0;i<nums.length;i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }        

        while(start < end){
            int mid = start +(end-start)/2;
            int pices =1;
            int sum = 0;

            for(int num : nums){
                if(num+sum > mid){
                    pices = pices+1;
                    sum = num;
                }
                else{
                    sum += num;
                }
            }
            if(pices>k){
                  start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
}
