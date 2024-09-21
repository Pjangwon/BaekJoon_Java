package BaekJoon.BOJSolve;
import java.io.*;

public class BOJ_4470 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      String st = br.readLine();
      bw.write(i+1 + ". " + st);
      bw.newLine();
    }
    bw.flush();
  }
}
