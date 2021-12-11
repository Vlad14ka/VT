package by.bsuir.Mukhliada.task5.util;

public class Sequence {
    // TODO Understand

    public static int getMinElementsForDel(int[] array) {
        return array.length - getLongestIncSubsequence(array).length;
    }

    private static int[] getLongestIncSubsequence(int[] sequence) {
        int ssLengths[] = new int[sequence.length];
        int subsequence[] = new int[sequence.length + 1];
        int longestLength = 0;

        for (int i = 0; i < sequence.length; i++) {

            int lo = 1;
            int hi = longestLength;

            while (lo <= hi) {
                int mid = (int) Math.ceil((lo + hi)/2.f);

                if (sequence[subsequence[mid]] < sequence[i]){
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }

            int newLongestLength = lo;

            ssLengths[i] = subsequence[newLongestLength - 1];
            subsequence[newLongestLength] = i;

            if (newLongestLength > longestLength){
                longestLength = newLongestLength;
            }
        }

        int[] longestSubsequence = new int[longestLength];
        int k = subsequence[longestLength];

        for (int i = longestLength - 1; i >= 0; i--) {
            longestSubsequence[i] = sequence[k];
            k = ssLengths[k];
        }

        return longestSubsequence;
    }
}
