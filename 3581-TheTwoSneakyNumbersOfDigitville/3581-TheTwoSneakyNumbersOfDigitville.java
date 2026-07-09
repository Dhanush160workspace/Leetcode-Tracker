// Last updated: 7/9/2026, 3:05:55 PM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        // int[] arr = new int[num.length];

        // for (int i=0; i<num.length; i++){
        //     int count = 0;
        //     for (int j=0; j<num.length; j++){
        //         if (num[i] == num[j]){
        //             count++;
        //         }
        //     }
        //     arr[i] = count;
        // }

        // int[] res = new int[2];
        // Arrays.fill(res, -1);

        // int freq = 0;
        // for (int i=0; i<arr.length; i++){
        //     if (freq == 2) break;
        //     if (res[0] != num[i] && arr[i] == 2){
        //         res[freq] = num[i];
        //         freq++;
        //     }
        // }

        // return res;

        int[] ans = new int[2];
		Arrays.sort(nums);
		int n = 0;
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==nums[i+1])
				ans[n++] = nums[i];
		}
        return ans;
    }
}