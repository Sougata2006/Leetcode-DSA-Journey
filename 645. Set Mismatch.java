class Solution {
    
    public int[] findErrorNums(int[] nums) {
        int i= 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[correct] != nums[i]){
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int s=0;s<nums.length;s++){
            if(nums[s] != s+1){
                ans.add(nums[s]);
                ans.add(s+1);
             }
        }
        return new int[] {ans.get(0) , ans.get(1)};
    }
}
