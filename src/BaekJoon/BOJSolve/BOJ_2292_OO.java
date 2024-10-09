package BaekJoon.BOJSolve;

import java.io.*;

public class BOJ_2292_OO {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    long roomNum = Long.parseLong(br.readLine());
    long roomCount = 1;
    long divNum = 1;

    while (true) {

      if (divNum >= roomNum) {
        bw.write(roomCount + "\n");
        break;
      }
      divNum += 6 * roomCount++;
    }
    bw.flush();
  }
}
