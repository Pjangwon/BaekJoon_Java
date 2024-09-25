package BaekJoon.BOJSolve;

import java.io.*;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class BOJ_2908 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer num = new StringTokenizer(br.readLine());

    String num1 = new StringBuilder(num.nextToken()).reverse().toString();
    String num2 = new StringBuilder(num.nextToken()).reverse().toString();

    bw.write(((Integer.parseInt(num1) > Integer.parseInt(num2)) ? num1 : num2) + "\n");
    bw.flush();
  }
}