public class f_9 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = i;
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
