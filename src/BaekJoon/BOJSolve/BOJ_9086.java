package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_9086 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      String st = br.readLine();
      bw.write(st.charAt(0) + "" + st.charAt(st.length() - 1) + "\n"); //아스키 코드 출력 방지 "" 삽입
    }
    bw.flush();
  }
}
