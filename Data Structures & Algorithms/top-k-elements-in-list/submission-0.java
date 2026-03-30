class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
       
        List<Integer>[] freqArray = new List[nums.length+1];
        Map<Integer,Integer> freqMap = new HashMap<>();

        
        int ix = 0;
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            freqArray[ix] = new ArrayList<>();
            ix++;
        }
        freqArray[ix] = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
            freqArray[entry.getValue()].add(entry.getKey()); 
        }

        int index=0;
        for(int i=freqArray.length-1;i>0;i--){
            for(int num: freqArray[i]){
                result[index++] = num;
                if(index == k){
                    return result;
                }
            }
        }

        return new int[0];
    }
}
