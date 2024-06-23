public class ArrayUtils {

    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не має бути нульовим або порожнім");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Матриця не має бути нульовою");
        }
        int rowCount = matrix.length;
        for (int[] row : matrix) {
            if (row.length != rowCount) {
                return false;
            }
        }
        return true;
    }
}
