public class Main {
    public static void main(String[] args) {
        int columns = 3;
        int rows = 3;
        float[][] matrix1 = {
                {1, 2, 3},
                {2, 1, 4},
                {1, 5, 6}
        };

        float[][] matrix2 = {
                {2, 2, 8},
                {2, 2, 4},
                {3, 4, 1}
        };

        Matrix matrixClass = new Matrix(matrix2, rows, columns);
        matrixClass.print();

        matrixClass.addition(matrix1, matrix2);
        matrixClass.multiply(matrix1, 3);

        matrixClass.multiplyMatrix(matrix1, matrix2);

    }
}