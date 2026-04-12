class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];

            for(int j = 0; j < nums.length; j++){
                int num1 = nums[j];
                if(num + num1 == target && i != j){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}
