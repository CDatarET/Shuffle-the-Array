class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] p1 = Arrays.copyOfRange(nums, 0, n);
        int[] p2 = Arrays.copyOfRange(nums, n, nums.length);

        int index = 0;
        boolean flip = false;

        for(int i = 0; i < nums.length; i++){
            if(flip){
                nums[i] = p2[index];
                index++;
                flip = false;
            }
            else{
                nums[i] = p1[index];
                flip = true;
            }
        }

        return(nums);
    }
}
