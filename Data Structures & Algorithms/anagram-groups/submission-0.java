class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> temp = new HashMap<>();

        for(String str: strs){
            int[] freq = new int[26];
            for(int i=0; i<str.length(); i++){
                freq[str.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(freq);
            temp.putIfAbsent(key, new ArrayList<>());
            temp.get(key).add(str);
        }

        return new ArrayList<>(temp.values());

    }
}
