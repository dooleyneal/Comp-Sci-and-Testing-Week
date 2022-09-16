import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {

    }
    public static int missingNumber(int[] nums, int maxNum) {
        Set<Integer> numSet = new HashSet<Integer>();
        for (int i: nums) {
            numSet.add(i);
        }

        for (int i = 1; i <= maxNum ; i++) {
            if(!numSet.contains(i)) {
                return i;
            }
        }
        return 0;
    }



    public static int missingNumber2(int[] nums, int maxNum) {
        Arrays.sort(nums);
        for (int i = 1; i <= maxNum ; i++) {
            if(i == maxNum && maxNum != nums.length) {
                return maxNum;
            }
            if(i != nums[i-1]) {
                return i;
            }
        }

        return 0;
    }


    public static int missingNumber3(int[] nums, int maxNum) {
        return ((maxNum)*(maxNum+1)/2) - Arrays.stream(nums).sum();
    }
}

