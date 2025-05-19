class Solution {
    public double minimumAverage(int[] nums) {

        Arrays.sort(nums);
        double avg ;
        double min =Double.MAX_VALUE;
        for(int i=0;i<nums.length/2;i++){
            avg = (nums[i]+nums[nums.length-i-1])/2.0;        
            min = Math.min(min,avg);
       
        }
        return min;
    }
}
