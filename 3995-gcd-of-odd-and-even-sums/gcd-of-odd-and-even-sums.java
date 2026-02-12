class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;

        for(int i=1; i<=n*2; i++){
            if(i%2!=0){
                sumOdd += i;
            }
        }
        for(int i=1; i<=n*2; i++){
            if(i%2==0){
                sumEven += i;
            }
        }
        return gcd(sumOdd, sumEven);
    }
    public static int gcd(int a, int b){
        int div = 1;
        int min = 0;
        if(a>b) min = a;
        else{ min = b;}
        for(int i = 2; i<=min; i++){
            if(a%i==0 && b%i==0 && div < i){
                div = i;
            }
        }
        return div;
    }
}