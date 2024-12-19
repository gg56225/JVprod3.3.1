import java.util.Arrays;

public class ArrayUtils {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        return Arrays.equals(array1, array2);
    }
}
