class Solution {
    public int maxSubArray(int[] nums) {
        int max = maxsub(0, nums.length - 1, nums);
        return max;
    }

    public int maxsub(int left, int right, int[] nums) {
        if (left == right) {
            return nums[left];
        }

        int l = left;
        int r = right;
        int mid = (l + r) / 2;

        int leftmax = maxsub(l, mid, nums);
        int rightmax = maxsub(mid + 1, r, nums);
        int crossmax = maxCross(l, r, mid, nums);

        return Math.max(Math.max(leftmax, rightmax), crossmax);
    }

    public int maxCross(int left, int right, int mid, int[] nums) {
        int sum = 0;
        int maxLeft = Integer.MIN_VALUE;
        int maxRight = Integer.MIN_VALUE;

        for (int i = mid; i >= left; i--) {
            sum = sum + nums[i];
            if (sum > maxLeft) {
                maxLeft = sum;
            }
        }

        sum = 0;
        for (int j = mid + 1; j <= right; j++) {
            sum = sum + nums[j];
            if (sum > maxRight) {
                maxRight = sum;
            }
        }

        return maxLeft + maxRight;
    }
}

