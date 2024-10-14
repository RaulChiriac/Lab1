import java.util.Arrays;
public class Aufg4 {
    public static int getChKeyboard(int[] keyboards) {
        return Arrays.stream(keyboards).min().getAsInt();
    }
    public static int getMostExp(int[] keyboards, int[] usbs) {
        return Math.max(Arrays.stream(keyboards).max().orElse(0), Arrays.stream(usbs).max().orElse(0));
    }
    public static int getExpUsb(int[] usbs, int buget) {
        return Arrays.stream(usbs).filter(price -> price <= buget).max().orElse(-1);
    }
    public static int getMaxGeldbetrag(int[] keyboards, int[] usbs, int buget) {
        int maxSpent = -1;
        for (int keyboard : keyboards) {
            for (int usb : usbs) {
                int total = keyboard + usb;
                if (total > maxSpent && total <= buget) {
                    maxSpent = total;
                }
            }
        }
        return maxSpent;
    }
    public static void main(String[] args) {
        int[] keyboards = {40, 60};
        int[] usbs = {8, 12};
        int buget = 60;

        System.out.println("Die billigste Tastatur: " + getChKeyboard(keyboards));
        System.out.println("Der teuerste Gegenstand: " + getMostExp(keyboards, usbs));
        System.out.println("Der teuerste USB: " + getExpUsb(usbs, buget));
        System.out.println("Maximalen Geldbetrag: " + getMaxGeldbetrag(keyboards, usbs, buget));
    }
}
