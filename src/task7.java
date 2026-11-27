public class task7 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 2, 7, 4, 9, 6};
        int[] evens = new int[arr.length];
        int count = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evens[count] = num;
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(evens[i] + " ");
        }
        System.out.println();
    }
}
