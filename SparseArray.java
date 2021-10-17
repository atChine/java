package com.Sparse_array;

public class SparseArray {
    public static void main(String[] args) {
        int chessArr01[][] = new int[11][11];
        chessArr01[1][2] = 1;
        chessArr01[2][3] = 2;
        for (int[] row : chessArr01) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }
}
