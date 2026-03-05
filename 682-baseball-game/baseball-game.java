import java.util.*;

class Solution {
    public int calPoints(String[] operations) {

        ArrayList<String> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for(int i=0; i<operations.length; i++){
            al1.add(operations[i]);
        }
        for(int i=0; i<al1.size(); i++){
            if(al1.get(i).equals("+")){
                int size = al2.size();
                al2.add(al2.get(size-1) + al2.get(size-2));
            }
            else if(al1.get(i).equals("D")){
                al2.add(al2.get(al2.size()-1) * 2);
            }
            else if(al1.get(i).equals("C")){
                al2.remove(al2.size()-1);
            }

            else{
                al2.add(Integer.parseInt(al1.get(i)));
            }
        }

        int sum = 0;
        for(int i : al2){
            sum += i;
        }

        return sum;
    }
}