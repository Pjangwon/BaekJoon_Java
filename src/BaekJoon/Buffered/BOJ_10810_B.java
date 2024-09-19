package BaekJoon.Buffered;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10810_B {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer NM = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(NM.nextToken()); //바구니 개수
    int M = Integer.parseInt(NM.nextToken()); //시도할 개수

    int[] arr = new int[N];

    for (int h = 0; h < M; h++) {
      StringTokenizer ijk = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(ijk.nextToken());
      int j = Integer.parseInt(ijk.nextToken());
      int k = Integer.parseInt(ijk.nextToken());

      for (; i <= j; i++) {
        arr[i-1] = k;
      }
    }
    for (int i = 0; i < N; i++) {
      bw.write(arr[i] + " ");
    }
    bw.flush();
  }
}
