public class task6 {
    public static void main(String[] args) {
        int[] arr = {6, 9, 3, 8, 6, 10, 2, 7};

        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}
