class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        double power = Math.log10(n) / Math.log10(4);
        return power == Math.ceil(power);
    }
}
