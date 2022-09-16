import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {

        System.out.println(missingNumber(new int[]{2, 1, 4, 3, 6, 5, 7, 10, 9}, 10));
        System.out.println(missingNumber2(new int[]{2, 1, 4, 3, 6, 5, 7, 10, 9}, 10));
        System.out.println(missingNumber3(new int[]{2, 1, 4, 3, 6, 5, 7, 10, 9, 8}, 10));
    }


    //My solution used a for-loop to generate the hash set whereas the given solution used a variety pf array methods.
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


    //The logic in my if statements and for-loop differ from the given solution but they both achieve n*log(n) runtime
    //by using the sort() method.
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


    //My solution does not use a for loop to generate the Array sum, rather I just used
    //the formula for summing the first n natural numbers to generate my expectedSum.
    //My solution does also use the .stream(nums).sum() method to generate the actualSum.
    public static int missingNumber3(int[] nums, int maxNum) {
        return ((maxNum)*(maxNum+1)/2) - Arrays.stream(nums).sum();
    }
}


