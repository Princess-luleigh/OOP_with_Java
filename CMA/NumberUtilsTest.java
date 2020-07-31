import java.util.Arrays;

public class NumberUtilsTest {

    public static void main(String[] args) {
        System.out.println("Array is");
        int[] returned = NumberUtils.toArray(3930);
        System.out.println(Arrays.toString(returned));
        System.out.println(NumberUtils.countMatches(39628, 79324));
        System.out.println(NumberUtils.countIntersect(39628, 79324));
    }
}