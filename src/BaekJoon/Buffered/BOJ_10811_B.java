package BaekJoon.Buffered;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10811_B {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer NM = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(NM.nextToken());
    int M = Integer.parseInt(NM.nextToken());

    int[] basket = new int[N];

    for (int i = 0; i < N; i++) {
      basket[i] = i+1;
    }

    for (int i = 1; i <= M; i++) {
      StringTokenizer jk = new StringTokenizer(br.readLine());
      int j = Integer.parseInt(jk.nextToken());
      int k = Integer.parseInt(jk.nextToken());
      for (;j < k; ) {
        int temp = basket[j-1];
        basket[j-1] = basket[k-1];
        basket[k-1] = temp;
        j++;
        k--;
      }
    }
    for (int i = 0; i < N; i++) {
      bw.write(basket[i] + " ");
    }
    bw.flush();
  }
}