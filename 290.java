public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] splitstrs = str.split(" ");
        if (splitstrs.length != pattern.length()){return false;}
        int i = 0;
        Map<String,String> test = new HashMap<String,String>();
        for (String splitstr : splitstrs ){
            if (test.containsValue(splitstr)){i++;continue;}
            test.put(pattern.substring(i++,i),splitstr);
        }
        for (i = 0; i < pattern.length(); i++){
            if ((!test.containsKey(pattern.substring(i,i+1))) || (!test.get(pattern.substring(i,i+1)).equals(splitstrs[i]))){return false;}
        }
        return true;
    }
}