// Last updated: 7/26/2026, 6:49:12 PM
1class Solution {
2    public List<Integer> findWordsContaining(String[] words, char x) {
3        List<Integer> list=new ArrayList<>(words.length);
4        for(int j=0;j<words.length;j++){
5            if(words[j].indexOf(x)!=-1){
6                list.add(j);
7            }
8        }    
9        return list;
10        
11    }
12}