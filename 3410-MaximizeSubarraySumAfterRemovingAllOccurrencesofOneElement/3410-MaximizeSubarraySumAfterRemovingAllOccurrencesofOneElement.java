// Last updated: 7/19/2026, 10:53:40 AM
1import java.util.*;
2
3class Solution {
4
5    class SegmentData {
6        long totalSum, prefixSum, suffixSum, maxSum;
7
8        public SegmentData() {
9            totalSum = 0;
10            maxSum = Integer.MIN_VALUE;
11            prefixSum = Integer.MIN_VALUE;
12            suffixSum = Integer.MIN_VALUE;
13        }
14
15        public SegmentData(int value) {
16            totalSum = value;
17            maxSum = value;
18            prefixSum = value;
19            suffixSum = value;
20        }
21    }
22
23    private List<SegmentData> segmentTree;
24
25    private SegmentData merge(SegmentData left, SegmentData right) {
26        SegmentData result = new SegmentData();
27        result.totalSum = left.totalSum + right.totalSum;
28        result.prefixSum = Math.max(left.prefixSum, left.totalSum + right.prefixSum);
29        result.suffixSum = Math.max(right.suffixSum, right.totalSum + left.suffixSum);
30        result.maxSum = Math.max(left.maxSum, right.maxSum);
31        result.maxSum = Math.max(result.maxSum, result.prefixSum);
32        result.maxSum = Math.max(result.maxSum, result.suffixSum);
33        result.maxSum = Math.max(result.maxSum, left.suffixSum + right.prefixSum);
34        return result;
35    }
36
37    private void buildTree(int left, int right, int index, int[] arr) {
38        if (left == right) {
39            segmentTree.set(index, new SegmentData(arr[left]));
40            return;
41        }
42        int mid = (left + right) / 2;
43        buildTree(left, mid, 2 * index + 1, arr);
44        buildTree(mid + 1, right, 2 * index + 2, arr);
45        segmentTree.set(index, merge(segmentTree.get(2 * index + 1), segmentTree.get(2 * index + 2)));
46    }
47
48    private void updateTree(int left, int right, int index, int position, int value) {
49        if (position < left || position > right) return;
50        if (left == right && position == left) {
51            segmentTree.get(index).totalSum = segmentTree.get(index).prefixSum = segmentTree.get(index).suffixSum = segmentTree.get(index).maxSum = value;
52            return;
53        }
54        int mid = (left + right) / 2;
55        updateTree(left, mid, 2 * index + 1, position, value);
56        updateTree(mid + 1, right, 2 * index + 2, position, value);
57        segmentTree.set(index, merge(segmentTree.get(2 * index + 1), segmentTree.get(2 * index + 2)));
58    }
59
60    public long maxSubarraySum(int[] arr) {
61        int n = arr.length;
62        segmentTree = new ArrayList<>(4 * n);
63        for (int i = 0; i < 4 * n; i++) {
64            segmentTree.add(new SegmentData());
65        }
66
67        // Using TreeMap to store indices by value
68        TreeMap<Integer, List<Integer>> valueToIndices = new TreeMap<>();
69        buildTree(0, n - 1, 0, arr);
70        long maxSubarraySum = segmentTree.get(0).maxSum;
71
72        for (int i = 0; i < n; i++) {
73            valueToIndices.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
74        }
75
76        // If the largest value in the map is negative, return that value
77        if (!valueToIndices.isEmpty() && valueToIndices.lastEntry().getKey() < 0) {
78            return valueToIndices.lastEntry().getKey();
79        }
80
81        for (Map.Entry<Integer, List<Integer>> entry : valueToIndices.entrySet()) {
82            int value = entry.getKey();
83            List<Integer> indices = entry.getValue();
84            if (indices.size() == n) continue;
85
86            // Set elements at indices to 0 temporarily
87            for (int idx : indices) updateTree(0, n - 1, 0, idx, 0);
88            maxSubarraySum = Math.max(maxSubarraySum, segmentTree.get(0).maxSum);
89
90            // Restore original values
91            for (int idx : indices) updateTree(0, n - 1, 0, idx, value);
92        }
93
94        return maxSubarraySum;
95    }
96}