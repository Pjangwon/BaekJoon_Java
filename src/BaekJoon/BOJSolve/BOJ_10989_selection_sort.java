package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_10989_selection_sort {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      int tmp = arr[i];
      arr[i] = arr[min];
      arr[min] = tmp;
    }

    for (int i : arr) {
      bw.write(i + "\n");
    }
    bw.flush();
  }
}
