public class Solution {
    public static String reverseWords(String s) {
        while (s.startsWith(" ")){ s = s.substring(1);}
        String[] strs = s.split(" ");
        int len = strs.length;
        String tmp;
        for (int i = 0; i < (int)((len+1)/2); i++){
            tmp = strs[len-1-i];
            strs[len-1-i] = strs[i];
            strs[i] = tmp;
        }
        return join(" ",strs);
    }
	
	public static String join(String join, String[] strAry){
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<strAry.length;i++){
		    if (strAry[i].length() == 0){continue;}
			if(i==(strAry.length-1)){
				sb.append(strAry[i]);
			}else{
				sb.append(strAry[i]).append(join);
			}
		}
		return new String(sb);
	}
}
