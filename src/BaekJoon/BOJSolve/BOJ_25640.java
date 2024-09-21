package BaekJoon.BOJSolve;
import java.io.*;

public class BOJ_25640 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String jinhoMBTI = br.readLine();
    int N = Integer.parseInt(br.readLine());
    int count = 0;

    for (int i = 0; i<N; i++) {
      String friendMBTI = br.readLine();
      if (jinhoMBTI.equals(friendMBTI)) {
        count++;
      }
    }
    bw.write(count + "\n");
    bw.flush();
  }
}
