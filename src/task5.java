public class task5 {
    public static void main(String[] args) {
        int[] arr = {1, 4, -2, 0, 8, 3};

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
