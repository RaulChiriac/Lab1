import java.util.Arrays;
public class GrosseZahlen {
    public static int[] sumBigNum(int[] num1, int[] num2) {
        int[] result = new int[num1.length + 1];
        int carry = 0;
        for (int i = num1.length - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }
        result[0] = carry;
        return result;
    }
    public static int[] diffBigNum(int[] num1, int[] num2) {
        int[] result = new int[num1.length];
        int borrow = 0;
        for (int i = num1.length - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }
        return result;
    }
    public static int[] mulBigNum(int[] num, int dig) {
        int[] result = new int[num.length];
        int carry = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            int prod = num[i] * dig + carry;
            result[i] = prod % 10;
            carry = prod / 10;
        }
        return result;
    }
    public static int[] divBigNum(int[] num, int dig) {
        int[] result = new int[num.length];
        int rest = 0;
        for (int i = 0; i < num.length; i++) {
            int current = rest * 10 + num[i];
            result[i] = current / dig;
            rest = current % dig;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] num3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] num5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};

        System.out.println("Sume: " + Arrays.toString(sumBigNum(num1, num2)));
        System.out.println("Diff: " + Arrays.toString(diffBigNum(num3, num4)));
        System.out.println("Mul: " + Arrays.toString(mulBigNum(num5, 2)));
        System.out.println("Div: " + Arrays.toString(divBigNum(num5, 2)));
    }
}
