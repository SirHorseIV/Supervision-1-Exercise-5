public class Exercise5 {
    static int lowestCommon(long a, long b) {
        long setBitsInCommon = a & b;
        if (setBitsInCommon == 0) {
            return -1;
        }
        int position = 0;
        // Find position of least significant 1 in bitsInCommon
        while ((setBitsInCommon & 1) == 0) {
            setBitsInCommon >>= 1;
            position++;
        }
        return position;
    }
}
