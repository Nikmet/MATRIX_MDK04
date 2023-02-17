public class Main {
    public static void main(String[] args) {
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

        Matrix matrixClass = new Matrix(matrix1);
        Matrix matrixClass2 = new Matrix(matrix2);

        matrixClass.columns = 3;
        matrixClass.rows = 3;

        matrixClass.print();

        matrixClass.addition(matrixClass, matrixClass2);
        matrixClass.multiply(matrixClass, 3);
        matrixClass.multiply(matrixClass2, 3);

        matrixClass.multiplyMatrix(matrixClass, matrixClass2);

    }
}