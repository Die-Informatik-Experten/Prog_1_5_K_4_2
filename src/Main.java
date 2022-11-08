import java.util.Random;

/**
 * Creates two 2x2-matrices
 * Fills the matrices with random integer values
 * Prints the two matrices to the console
 *
 * Adds the matrices together
 * Outputs the result of the addition to the console
 *
 * Multiplies the matrices
 * Outputs the result of the multiplication to the console
 *
 * @author Enno Stassny
 * @version 1.0
 * @since 1.0
 *
 */
public class Main
{
    public static void main(String args[])
    {
        /* Declaration  of two 2D matrices */
        int[][] firstMatrix = new int[2][2];
        int[][] secondMatrix = new int[2][2];

        // Fill matrices with random integers
        fill2DMatrixWithRandomIntegers(firstMatrix);
        fill2DMatrixWithRandomIntegers(secondMatrix);

        // Print the filled matrices to the console
        System.out.print("First matrix:");
        printMatrix(firstMatrix);
        System.out.println("\n");
        System.out.print("Second matrix:");
        printMatrix(secondMatrix);
        System.out.println("\n");

        // Add the first matrix to the second
        int[][] additionResultMatrix = addTwoMatrices(firstMatrix, secondMatrix);
        System.out.print("Addition result matrix:");
        printMatrix(additionResultMatrix);
        System.out.println("\n");

        // Multiplies the matrices
        int[][] multiplicationResultMatrix = multiplyTwoMatrices(firstMatrix, secondMatrix);
        System.out.print("Multiplication result matrix:");
        printMatrix(multiplicationResultMatrix);
        System.out.println("\n");
    }

    /**
     * This methode fills all fields of a 2D matrix with random integers
     *
     * @param matrix a 2D matrix
     */
    private static void fill2DMatrixWithRandomIntegers(int[][] matrix)
    {
        Random random = new Random();
        // Loop through the number of rows
        for (int i = 0; i < matrix.length; i++)
            // Loop through the number of columns
            for (int j = 0; j < matrix[0].length; j++)
                matrix[i][j] = random.nextInt();
    }

    /**
     * Returns a 2D matrix that is the result of adding the first and second matrix together
     * <p>
     * This methode adds the first matrix to the second
     * Important: The matrices must be of the same amount of columns and rows
     *
     * @param firstMatrix  a 2D matrix
     * @param secondMatrix a 2D matrix
     * @return a new 2D matrix
     */
    private static int[][] addTwoMatrices(int[][] firstMatrix, int[][] secondMatrix)
    {
        // Create a new matrix of the same size as the input matrices
        int[][] finalMatrix = new int[firstMatrix.length][firstMatrix[0].length];

        for (int i = 0; i < firstMatrix.length; i++) // Loop through the number of rows
            for (int j = 0; j < firstMatrix[0].length; j++) // Loop through the number of columns
                /* We are now in the same column and row in all matrices
                 * Set the value of the final matrix to the sum of the first and seconds matrix
                 */
                finalMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];

        return finalMatrix;
    }

    /**
     * Returns a 2D matrix that is the result of multiplying two matrices together
     * <p>
     * This methode multiplies two matrices with each other
     * Important: The matrices must be of the same amount of columns and rows
     *
     * @param firstMatrix  a 2D matrix
     * @param secondMatrix a 2D matrix
     * @return a new 2D matrix
     */
    private static int[][] multiplyTwoMatrices(int[][] firstMatrix, int[][] secondMatrix)
    {
        // Create a new matrix of the same size as the input matrices
        int[][] finalMatrix = new int[firstMatrix.length][firstMatrix[0].length];

        for (int i = 0; i < firstMatrix.length; i++) // Loop through the number of rows
            for (int j = 0; j < firstMatrix[0].length; j++) // Loop through the number of columns
                for (int k = 0; k < firstMatrix[0].length ; k++) // Loop through the number of rows
                    finalMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j]; //Perform the multiplication

        return finalMatrix;
    }

    /**
     * This methode prints a 2D matrix to the console
     *
     * @param matrix a 2D matrix
     */
    private static void printMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++) // Loop through the number of rows
        {
            System.out.print("\n"); //Print a new line for every row
            for (int j = 0; j < matrix[0].length; j++) // Loop through the number of columns
                System.out.print(matrix[i][j] + "\t"); //Print the value of the current field to the console
        }
    }
}
