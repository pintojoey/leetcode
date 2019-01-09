class Solution {
public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int end = 1;
        int length = 0;
        int n = gas.length;

        int tank = 0;
        while (true) {
            if (end >= n) end = 0;


            int next = end - 1;
            if (next < 0) next = n - 1;

            tank += gas[next];
            tank -= cost[next];

            if (tank >= 0) {
                length++;
                if (start == end) {
                    if (length == n) {
                        return start;
                    } else {
                        return -1;
                    }
                }
                end++;
            } else {
                start++;
                if (start >= n) return -1;
                end = start + 1;
                length = 0;
                tank = 0;
            }


        }
    }
}
