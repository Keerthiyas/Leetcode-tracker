// Last updated: 9/25/2026, 8:56:35 AM
1class Solution {
2    public void solve(int[] nums, int index, List<Integer> output, Set<List<Integer>> ans) {
3        // base case: if we have reached the end of the input array
4        if (index >= nums.length) {
5            // only add the output if it has more than one element
6            if (output.size() > 1) {
7                ans.add(new ArrayList<>(output));
8            }
9            return;
10        }
11        
12        // if the output is empty or the current element is greater than or equal to the last element in the output
13        if (output.isEmpty() || nums[index] >= output.get(output.size() - 1)) {
14            // add the current element to the output and recursively call solve
15            output.add(nums[index]);
16            solve(nums, index+1, output, ans);
17            // remove the last element from the output before returning
18            output.remove(output.size() - 1);
19        }
20        
21        // recursively call solve without adding the current element to the output
22        solve(nums, index+1, output, ans);
23    }
24    
25    public List<List<Integer>> findSubsequences(int[] nums) {
26        // use a set to store the unique sub sequences
27        Set<List<Integer>> ans = new HashSet<>();
28        solve(nums, 0, new ArrayList<>(), ans);
29        return new ArrayList<>(ans);
30    }
31}