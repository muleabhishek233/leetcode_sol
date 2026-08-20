class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp = num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        num = rev;
        int revAgain = 0;
        while (num > 0) {
            revAgain = revAgain * 10 + num % 10;
            num /= 10;
        }
        return temp == revAgain;
}
}