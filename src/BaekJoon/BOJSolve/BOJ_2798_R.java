package BaekJoon.BOJSolve;

import java.io.*;
import java.util.*;

public class BOJ_2798_R {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer nm = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(nm.nextToken());
    int M = Integer.parseInt(nm.nextToken());

    int result = 0;

    int[] arr = new int[N];

    StringTokenizer cardArr = new StringTokenizer(br.readLine());

    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(cardArr.nextToken());
    }

    for (int i = 0; i < N - 2; i++) {
      for (int j = i + 1; j < N - 1; j++) {
        for (int k = j + 1; k < N; k++) {
          int sum = arr[i] + arr[j] + arr[k];
          if (M - sum < M - result && sum <= M) {
            result = sum;
          }
        }
      }
    }
    bw.write(result + "\n");
    bw.flush();
  }
}