class Solution {
    public int addDigits(int num) {

        while (!isSingleDigit(num)) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum; // repeat with new number
        }

        return num;
    }

    public boolean isSingleDigit(int num) {
        return num < 10;
    }
}
