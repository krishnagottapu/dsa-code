class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for(String str: strs){
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();

        int i = 0;
        while(i < str.length()-1){
            int j = i;           
            while (str.charAt(j) != '#') {
                j++;
            }
            int strLength = Integer.parseInt(str.substring(i,j));
            i=j+1;
            j=i+strLength ;

            decodedStrings.add(str.substring(i, j));

            i = j;
        }

        return decodedStrings;

    }
}
