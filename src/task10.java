public class task10 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 2, 3},
                {4, 0, 6},
                {0, 8, 0}
        };

        int zeros = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeros++;
                }
            }
        }

        System.out.println("Zeros: " + zeros);
    }
}
