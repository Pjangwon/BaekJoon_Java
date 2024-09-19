package BaekJoon.Buffered;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10807_B {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int V = Integer.parseInt(br.readLine());

    int[] numStore = new int[N];
    int count = 0;

    for (int i = 0; i < N; i++) {
      numStore[i] = Integer.parseInt(st.nextToken());
      if (numStore[i] == V) {
        count++;
      }
    }
    bw.write(count + "\n");
    bw.flush();
  }
}