import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];

        System.out.println("Enter 8 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int num : arr) {
            if (num >= 10 && num <= 20) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}
