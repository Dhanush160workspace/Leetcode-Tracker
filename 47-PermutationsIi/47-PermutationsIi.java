// Last updated: 7/9/2026, 3:11:17 PM
class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutations(0, nums, ans);
        return ans;
    }

    public void permutations(int i, int[] nums, List<List<Integer>> ans) {

        if (i == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            ans.add(temp);
            return;
        }

        HashSet<Integer> used = new HashSet<>();

        for (int j = i; j < nums.length; j++) {

            if (used.contains(nums[j])) {
                continue;
            }

            used.add(nums[j]);

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            permutations(i + 1, nums, ans);

            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}