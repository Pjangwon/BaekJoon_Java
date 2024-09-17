package BaekJoon.Buffered;

import java.io.*;
import java.util.StringTokenizer;

public class Count {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    String numLine = br.readLine();
    String checkNum = br.readLine();
    int count = 0;

    String[] numStore = numLine.split(" ");

    for (int i = 0; i < N; i++) {
      if (numStore[i].equals(checkNum)) {
        count++;
      }
    }
    bw.write((count) + "\n");
    bw.flush();
  }
}