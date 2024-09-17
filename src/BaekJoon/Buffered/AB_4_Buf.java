package BaekJoon.Buffered;

import java.io.*;
import java.util.StringTokenizer;

public class AB_4_Buf {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String s;
    while ((s = br.readLine()) != null) {
      StringTokenizer st = new StringTokenizer(s, " ");
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      bw.write((a + b) + "\n");
    }
    bw.flush();
  }
}