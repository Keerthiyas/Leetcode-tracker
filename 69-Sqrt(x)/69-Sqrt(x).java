// Last updated: 7/19/2026, 7:43:08 AM
1class Solution {
2  static boolean search(int[]arr, int target) {
3        int start = 0;
4        int end = arr.length - 1;
5        while (start <= end) {
6
7            int mid = start + (end - start) / 2;
8            if (arr[mid] == target) {
9                return true;
10            }
11
12              //  To handle duplicates
13
14            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
15                start ++;
16                end --;
17                continue;
18            }
19            if(arr[mid] >= arr[start]){
20                if(arr[mid] > target && arr[start] <= target){
21                    end = mid-1;
22                }else start = mid+1;
23            } else{
24                if(arr[mid] < target && arr[end] >= target){
25                    start = mid+1;
26                }else end = mid-1;
27            }
28        }
29        return false;
30        }
31    }
32
33 