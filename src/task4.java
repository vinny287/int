public class task4 {
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 3, 9, 2, 6};

        int min = arr[0];
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("Min: " + min + ", index: " + minIndex);
    }
}
