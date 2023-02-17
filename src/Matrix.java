public class Matrix {

    public int columns;
    public int rows;
    private float[][] matrix_A = new float[this.rows][this.columns];

    public Matrix(float[][] matrix) {
        this.matrix_A = matrix;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix_A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void addition(Matrix matrix1, Matrix matrix2) {
        System.out.println("Сложение матриц: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print((matrix1.matrix_A[i][j] + matrix2.matrix_A[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public void multiply(Matrix matrix, float num) {
        System.out.println("Умножение матрицы на число " + num + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print((matrix.matrix_A[i][j] * num) + " ");
            }
            System.out.println();
        }
    }

    public void multiplyMatrix(Matrix matrix1, Matrix matrix2)
    {
        System.out.println("Умножение матриц: ");
        float[][]result = new float[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                for(int k=0;k<rows;k++)
                {
                    result[i][j] += matrix1.matrix_A[i][k] * matrix2.matrix_A[k][j];
                }
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
