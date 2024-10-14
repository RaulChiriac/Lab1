import java.sql.SQLOutput;
import java.util.Arrays;
public class ArrayOperationen {
    public static int getMax(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }
    public static int getMin(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }
    public static int getMinSum(int[] arr) {
        return Arrays.stream(arr).sum() - getMin(arr);
    }
    public static int getMaxSum(int[] arr) {
        return Arrays.stream(arr).sum() - getMax(arr);
    }
    public static void main(String[] args) {
        int[] arr = {4, 8, 3, 10, 17};
        System.out.println("Maxim: " + getMax(arr));
        System.out.println("Minim: " + getMin(arr));
        System.out.println("MinSum: " + getMinSum(arr));
        System.out.println("MaxSum: " + getMaxSum(arr));
    }
}
