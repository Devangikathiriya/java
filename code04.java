public class Matrix {
    public static void main(String[] args) {
        int[][] fMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] sMatrix = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] sum = new int[3][3];

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                sum[r][c] = fMatrix[r][c] + sMatrix[r][c];
            }
        }

        System.out.println("Addition of matrices:");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(sum[r][c] + " ");
            }
            System.out.println();
        }
    }
}