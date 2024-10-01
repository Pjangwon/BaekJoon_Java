package BaekJoon.BOJSolve;

import java.io.*;
import java.util.*;

public class BOJ_2738 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {

    StringTokenizer stt = new StringTokenizer(br.readLine());

    int rows = Integer.parseInt(stt.nextToken());
    int columns = Integer.parseInt(stt.nextToken());

    int[][] arrA = matrix(rows, columns);
    int[][] arrB = matrix(rows, columns);
    int[][] arrC = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        arrC[i][j] = arrA[i][j] + arrB[i][j];
        bw.write(arrC[i][j] + " ");
      }
      bw.newLine();
    }
    bw.flush();
  }

  public static int[][] matrix(int rows, int columns) throws IOException {

    int[][] matrixMaker = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      StringTokenizer stt = new StringTokenizer(br.readLine());
      for (int j = 0; j < columns; j++) {
        matrixMaker[i][j] = Integer.parseInt(stt.nextToken());
      }
    }

    return matrixMaker;
  }
}