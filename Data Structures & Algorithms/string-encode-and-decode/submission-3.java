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
            int j = str.indexOf('#',i);
            int strLength = Integer.parseInt(str.substring(i,j));

            decodedStrings.add(str.substring(j+1, j+1+strLength));
            i = j+strLength+1;
        }

        return decodedStrings;

    }
}
