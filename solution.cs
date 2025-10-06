public class Solution {
    public int[] Shuffle(int[] nums, int n) {
        int[] ret = new int[nums.Length];
        for(int i = 0; i < n; i++){
            ret[i * 2] = nums[i];
            ret[i * 2 + 1] = nums[i + n];
        }

        return(ret);
    }
}
