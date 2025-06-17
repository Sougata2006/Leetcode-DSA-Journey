class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i] <nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }   
        }
        for(int s=0;s<nums.length;s++){
        if(nums[s] != s)
        return s;
        }
            return nums.length;
    }
}
