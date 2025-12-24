class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];   
        char[] chars1 = ransomNote.toCharArray();
        char[] chars2 = magazine.toCharArray();

        for(int i = 0; i<chars2.length;i++){
             count[chars2[i] - 'a']++;
        }
        for(int i=0;i<chars1.length; i++){
            int idx = chars1[i] - 'a';
            if(count[idx]==0) return false;
            count[idx]--;
        }
        return true;
    }
}