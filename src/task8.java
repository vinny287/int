public class task8 {
    public static void main(String[] args) {
        int[] temps = {18, 20, 22, 19, 21, 24, 16};

        int sum = 0;
        for (int t : temps) {
            sum += t;
        }
        double average = (double) sum / temps.length;

        int above = 0;
        for (int t : temps) {
            if (t > average) {
                above++;
            }
        }

        System.out.println("Average: " + average + "; above: " + above);
    }
}
