class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i= 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int s=0;s<nums.length;s++){
            if(nums[s] != s+1){
                ans.add(s+1);
            }
        }
        return ans;
    }
}
