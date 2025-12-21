class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> m = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                m.add("FizzBuzz");
            }
            else if(i%3==0){
                m.add("Fizz");
            }
            else if(i%5==0){
                m.add("Buzz");
            }
            else{
                m.add(String.valueOf(i));
            }
        }
        return m;
    }
}