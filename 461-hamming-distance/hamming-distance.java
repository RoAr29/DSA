class Solution {
    public int hammingDistance(int x, int y) {
        String a = Integer.toBinaryString(x);
        String b = Integer.toBinaryString(y);

        int max = Math.max(a.length(), b.length());

        while(max != a.length()) a = '0'+a;
        while(max != b.length()) b = '0'+b;
        int count = 0 ;

        for(int i=0; i<max; i++){
            if(a.charAt(i)!=b.charAt(i)){
                count++;
            }
        }
        return count;
    } 
}