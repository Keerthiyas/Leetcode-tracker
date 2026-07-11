// Last updated: 7/11/2026, 10:37:14 AM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] temp = new int[Math.min(m, n)];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums1[i] == nums2[j]) {
                    temp[k++] = nums1[i];
                    nums2[j] = -1;
                    break;
                    }
            }
        }
        

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }
        
        return result;
    }
}
    