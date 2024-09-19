package BaekJoon.Buffered;
import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10818_B {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      int value = Integer.parseInt(st.nextToken());
      if (value > max) {
        max = value;
      }
      if (value < min || value > 0) {
        min = value;
      }

    }
    bw.write(min + " " + max + "\n");
    bw.flush();
  }
}