class Solution {
    public int countCommas(int n) {
        int count = 0;

        for (int place = 1000; place <= n; place *= 1000) {
            count += n - place + 1;
        }

        return count;
    }
}
