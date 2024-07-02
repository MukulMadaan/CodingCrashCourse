class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length() < 2) return "";
        Map<Character, Integer> map = new HashMap<>();
        char[] str = s.toCharArray();
        for(char it : str){
            if (map.containsKey(it)){
                map.put(it, map.get(it) + 1);
            }else{
                map.put(it, 1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(Character.toUpperCase(str[i])) && map.containsKey(Character.toLowerCase(str[i]))) continue;
            String s1 = longestNiceSubstring(s.substring(0, i));
            String s2 = longestNiceSubstring(s.substring(i+1, s.length()));
            return s1.length() >= s2.length() ? s1 : s2;
        }
        return s;
    }
}
