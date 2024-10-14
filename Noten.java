import java.util.Arrays;
public class Noten {
//    Nicht ausreichende Note
    public static int[] getFGrades(int[] grades)  {
        int count = 0;
        for (int grade : grades) {
            if (grade < 40) {
                count++;
            }
        }
        int[] fGrades = new int[count];
        int index = 0;
        for (int grade : grades) {
            if (grade < 40) {
                fGrades[index++] = grade;
            }
        }
        return fGrades;
    }
//    Durchschnittswert
    public static double getAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double)sum / grades.length;
    }
//    Abgerundeten Noten
    public static int[] getRound(int[] grades) {
        int[] roundGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if (grade >= 38) {
                int funfMul = ((grade / 5) + 1) * 5;
                if (funfMul - grade < 3) {
                    grade = funfMul;
                }
            }
            roundGrades[i] = grade;
        }
        return roundGrades;
    }
//    Maximale abgerundete Note
    public static int getMaxRound(int[] grades) {
        int max = 0;
        int[] roundGrades = getRound(grades);
        for (int grade : roundGrades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] grades = {29, 37,38,41,84,67};
        System.out.println("Nicht ausreichende Noten: " + Arrays.toString(getFGrades(grades)));
        System.out.println("Durchschnittswert: " + getAverage(grades));
        System.out.println("Abgerundeten Noten: " + Arrays.toString(getRound(grades)));
        System.out.println("Maximale abgerundete Noten: " + getMaxRound(grades));
    }
}
