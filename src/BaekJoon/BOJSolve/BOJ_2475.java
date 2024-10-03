package BaekJoon.BOJSolve;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2475 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int sum = 0;

    StringTokenizer stt = new StringTokenizer(br.readLine());
    for (int i = 0; i< 5; i++) {
      sum += Math.pow(Integer.parseInt(stt.nextToken()), 2) ;
    }

    bw.write(sum%10 + "\n");
    bw.flush();
  }
}
