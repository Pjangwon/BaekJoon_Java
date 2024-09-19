package BaekJoon.Buffered;

import java.io.*;

public class BOJ_5597_B {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] student = new int[30];

    for (int i =1; i <= 28; i++) {
      int n = Integer.parseInt(br.readLine());
      student[n-1] = n;
    }

    for (int i = 1; i <= 30; i++) {
      if (student[i-1] == 0){
        bw.write(i + "\n");
      }
    }
    bw.flush();
  }
}