package BaekJoon.Buffered;

import java.io.*;

public class HelloWorld_Buf {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    bw.write("Hello World!");
    bw.flush();
    bw.close();
  }
}
