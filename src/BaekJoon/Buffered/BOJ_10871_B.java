package BaekJoon.Buffered;
import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10871_B {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer NandX = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(NandX.nextToken());
    int X = Integer.parseInt(NandX.nextToken());

    StringTokenizer numLineSt = new StringTokenizer(br.readLine());
    int[] numStore = new int[N];

    for (int i = 0; i < N; i++) {
      numStore[i] = Integer.parseInt(numLineSt.nextToken());
    }

    for (int i = 0; i < N; i++) {
      if (numStore[i] < X) {
        bw.write(numStore[i] + " ");
      }
    }
    bw.flush();
  }
}
