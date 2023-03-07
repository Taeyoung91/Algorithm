import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LongestConsecutive {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
         list.add(num);
        }

        list.sort(Comparator.naturalOrder());

        int cnt = 1;
        int longestCnt = 1;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i-1) == 0) {
                continue;
            }
            if (list.get(i) - list.get(i-1) == 1) {
                cnt ++;
            } else {
                cnt = 1;
            }
            longestCnt = Math.max(longestCnt, cnt);
        }

        return longestCnt;
    }

}
