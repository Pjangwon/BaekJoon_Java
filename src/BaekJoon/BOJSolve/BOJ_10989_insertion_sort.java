package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_10989_insertion_sort {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    for (int i = 1; i < n; i++) {
      int tmp = arr[i];
      int aux = i - 1;
      while ((aux >= 0) && arr[aux] > tmp) {
        arr[aux + 1] = arr[aux];
        aux--;
      }
      arr[aux + 1] = tmp;
    }

    for (int i : arr) {
      bw.write(i + "\n");
    }
    bw.flush();
  }
}
