class Solution {
    public int[] twoSum(int[] nums, int target) {
    int [] res = new int [2];
    for(int i = 0; i < nums.length; i ++){
        int a = nums[i];
        int b = target - a;
        for(int j = i + 1; j < nums.length; j ++){
            if(b == nums[j]){
                res[0] = i;
                res[1] = j;
            }
        }
       }
       return res;
    }
}