// Last updated: 7/26/2026, 6:50:49 PM
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3        int m = word1.length(), n = word2.length();
4        if (m != n)
5            return false;
6
7        Map<Character, Integer> map1 = new HashMap<>();
8        Map<Character, Integer> map2 = new HashMap<>();
9
10        for (char c : word1.toCharArray())
11            map1.put(c, map1.getOrDefault(c, 0) + 1);
12
13        for (char c : word2.toCharArray()) {
14            if (!map1.containsKey(c))
15                return false;
16            map2.put(c, map2.getOrDefault(c, 0) + 1);
17        }
18
19        ArrayList<Integer> arr = new ArrayList<>();
20        for (Integer i : map1.values())
21            arr.add(i);
22
23        for (Integer i : map2.values())
24            if (arr.contains(i))
25                arr.remove(i);
26            else
27                return false;
28
29        return arr.isEmpty();
30    }
31}