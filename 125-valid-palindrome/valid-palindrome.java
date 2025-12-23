class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            char left=s.charAt(i);
            char right = s.charAt(j);

            if(!Character.isLetterOrDigit(left)){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(right)) {
    j--;
    continue;
}

            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}