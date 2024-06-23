public class TestArrayUtils {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double average = ArrayUtils.calculateAverage(array);
        System.out.println("Середнє арефметичне: " + average);

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        boolean isSquare = ArrayUtils.isSquareMatrix(matrix);
        System.out.println("Є квадратною матрицею: " + isSquare);

        int[][] nonSquareMatrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        boolean isNonSquare = ArrayUtils.isSquareMatrix(nonSquareMatrix);
        System.out.println("Не є квадратною матрицею: " + isNonSquare);
    }
}
