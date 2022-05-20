package com.example.demo;
//Транспонировать матрицу MxN.
//Задавать размер матрицы необходимо из консоли.
//Значения также получить из консоли
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class matrixTransposed {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //The rows` quantity for array will be an input from user
        System.out.println("Please, enter how many rows you would like to have in you future Matrix");
        int Rows = Integer.parseInt(READER.readLine());
        //The columns` quantity for array will be an input from user
        System.out.println("Please, enter how many columns you would like to have in you future Matrix");
        int Columns = Integer.parseInt(READER.readLine());
        //2 dim matrix created
        int[][] Matrix = new int[Rows][Columns];
        //2 dim TRANSPOSED matrix created
        int[][] TMatrix = new int[Columns][Rows];
        //Calling method to fill the matrix in
        matrixFill(Matrix);
        //Function to transpose the initial matrix
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                TMatrix[j][i] = Matrix[i][j];
            }
        }
        //Displaying initial and transposed matrix
        System.out.println("Initial Matrix:");
        //Calling Method to display Matrix
        matrixDisplay(Matrix);
        System.out.println("_________________________________________________");
        System.out.println("Transposed Matrix:");
        //Calling Method to display Matrix
        matrixDisplay(TMatrix);
        System.out.println("_________________________________________________");
        System.out.println("Initial Matrix - " + Arrays.deepToString(Matrix));//Used .deepToString(Matrix) to display the Matrix
        System.out.println("Initial Matrix - has " + Rows + " rows " + " and " + Columns + " Columns");
        System.out.println("_________________________________________________");
        System.out.println("Transposed Matrix - " + Arrays.deepToString(TMatrix));//Used .deepToString(Matrix) to display the Matrix
        System.out.println("Transposed Matrix - has " + Columns  + " rows " + " and " + Rows + " Columns");
        System.out.println("_________________________________________________");
    }
    //Method to fill the initial matrix from user`s input
    public static void matrixFill (int[][] Matrix) throws IOException {
        for (int i = 0; i < Matrix.length; i++) {
            System.out.println("Please, enter to the Matrix " + i + " Row element: ");
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.println("Please, enter to the Matrix " + j + " Column element: ");
                Matrix[i][j] = Integer.parseInt(READER.readLine());
            }
        }
    }
    //Method to display the matrix by 2 for construction
    public static void matrixDisplay (int[][] Matrix) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] + "\t");//Used tabulate to have better User experience
            }
            System.out.println();
        }
    }
}
