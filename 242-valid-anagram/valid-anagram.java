class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] charss = t.toCharArray();

        if(chars.length!=charss.length){
            return false;
        }

        Arrays.sort(chars);
        Arrays.sort(charss);

        int count = 0;
        for(int i=0; i<chars.length; i++){
                if(chars[i]==charss[i]) count++;
            }
        if(count == chars.length) return true;
        else{ return false;}
    }
}