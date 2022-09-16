import java.util.Arrays;
import java.util.Objects;

public class main {
    public static void main(String[] args) {
        System.out.println(recursiveSearch(1, new Object[]{2, 2, 1}));

    }
    //The runtime for this solution is O(n^2). In the worst case, the function has to make objects.length recursions,
    // and the Arrays.copyOfRange() has to copy objects.length-1 items each recursion.
    public static int recursiveSearch(Object object, Object[] objects) {

        if (objects.length == 0) {
            return -1;
        }
        else if (objects[objects.length - 1] == object) {
            return objects.length - 1;
        }
        else {
            return recursiveSearch(object, Arrays.copyOfRange(objects, 0, objects.length - 1));
        }
    }
}