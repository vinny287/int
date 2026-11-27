public class task2 {
            public static void main(String[] args) {
                int[] arr = {3, -2, 0, 7, -4, 5, 1, -8, 2, -6};
                int sum = 0;

                for (int num : arr) {
                    if (num > 0) {
                        sum += num;
                    }
                }

                System.out.println("Sum: " + sum);
            }
}
