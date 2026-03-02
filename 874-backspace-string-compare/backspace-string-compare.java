class Solution {
    public boolean backspaceCompare(String s, String t) {

        ArrayList<Character> al = new ArrayList<>();
        ArrayList<Character> at = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            al.add(s.charAt(i));
        }
        for(int i = 0; i < t.length(); i++){
            at.add(t.charAt(i));
        }
        for(int i = 0; i < al.size(); i++){
            if(al.get(i) == '#'){
                if(i > 0){
                    al.remove(i-1);   
                    i--;           
                }
                al.remove(i);        
                i--;             
            }
        }
        for(int i = 0; i < at.size(); i++){
            if(at.get(i) == '#'){
                if(i > 0){
                    at.remove(i-1);
                    i--;
                }
                at.remove(i);
                i--;
            }
        }
        return al.equals(at);
    }
}