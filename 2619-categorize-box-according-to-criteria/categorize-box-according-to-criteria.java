class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        ArrayList<Integer> al = new ArrayList<>();

        String category = "a";
        if(length>=10000 || width >= 10000 || height >= 10000 || mass >= 10000 || ((long)length*height*width)>= Math.pow(10, 9)){
            al.add(1);
        }
        if(mass>=100) al.add(2);

        if(al.contains(1) && al.contains(2)) category = "Both";

        if(!al.contains(1) && !al.contains(2)) category = "Neither";

        if(al.contains(1) && !al.contains(2)) category = "Bulky";

        if(al.contains(2) && !al.contains(1)) category = "Heavy";

        return category;
    }
}