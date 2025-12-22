class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] chars = jewels.toCharArray();
        char[] charss = stones.toCharArray();
        int count = 0;

        if(chars.length==0 || charss.length==0){
            return 0;
        }

        for(int i=0; i<chars.length; i++){
            for(int j=0; j<charss.length; j++){
                if(chars[i]==charss[j]){
                    count++;
                }
            }
        }
        return count;
    }
}